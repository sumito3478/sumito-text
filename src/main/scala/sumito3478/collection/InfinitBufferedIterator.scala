package sumito3478.collection

import scala.collection.immutable.VectorBuilder
import scala.collection.mutable.Queue

trait InfinitBufferedIterator[A] extends BufferedIterator[A]{
  protected[this] val intern: Iterator[A]
  
  private[this] val queue = new Queue[A]
  
  def head: A = {
    if(queue.isEmpty) {
      val ret = intern.next
      queue.enqueue(ret)
      ret
    } else {
      queue.front
    }
  }
  
  def lookAhead(length: Int): IndexedSeq[A] = {
    import sumito3478.collection.Riches._
    val read = length - queue.length
    if(read > 0) {
      queue.enqueue(intern.forceTake(read): _*)
    }
    (new VectorBuilder[A]() ++= queue.slice(0, length)).result
  }
  
  def hasNext: Boolean = {
    ! queue.isEmpty || intern.hasNext
  }
  
  def next: A = {
    if(queue.isEmpty) {
      intern.next
    } else {
      queue.dequeue
    }
  }
}
