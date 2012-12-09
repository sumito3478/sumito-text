package sumito3478.text

import com.ibm.icu.text.BreakIterator
import sumito3478.text.collection.immutable.StringText
import scala.collection.immutable.VectorBuilder
import scala.collection.mutable.Queue
import sumito3478.text.collection.immutable.StringTextBuilder


trait RichBreakIterator {
  protected[this] val self: BreakIterator
  
  def readAll(source: StringText): IndexedSeq[StringText] = {
    self.setText(source.toString)
    val first = self.first
    val builder = new VectorBuilder[Int]
    builder ++= (Iterator.continually(self.next).
      takeWhile(_ != BreakIterator.DONE))
    val retBuilder = new VectorBuilder[StringText]
    builder.result.foldLeft(first)((first, end) => {
      retBuilder += new StringText(source.toString.substring(first, end))
      end
    })
    retBuilder.result
  }
  
  def readToSecondLast(source: StringText): (IndexedSeq[StringText], Int) = {
    self.setText(source.toString)
    val first = self.first
    val last = self.last
    val secondLast = self.previous
    if(secondLast == first) {
      throw new NoSuchElementException
    }
    (readAll(new StringText(source.toString.substring(secondLast))), secondLast)
  }

  def mapIterator(source: Iterator[Char]): Iterator[StringText] = {
    import sumito3478.collection.RichIterator
    val aheadText = source.lookAhead
    val queue = new Queue[StringText]
    scala.collection.Iterator.continually[Option[StringText]](
      if (queue.isEmpty && aheadText.hasNext) {
        val ahead = aheadText.lookAhead(2048)
        queue.enqueue((
          if (ahead.length < 2048) {
            readAll((new StringTextBuilder ++= aheadText.forceTake(2048)).result)
          } else {
            val (ret, read) = readToSecondLast((new StringTextBuilder ++= ahead).result)
            aheadText.forceDrop(read)
            ret
          }): _*)
        Some(queue.dequeue)
      } else if (queue.isEmpty) {
        None
      } else {
        Some(queue.dequeue)
      }).takeWhile(_.isDefined).map(_.get)
  }
}
