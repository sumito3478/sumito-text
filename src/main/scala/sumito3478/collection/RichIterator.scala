package sumito3478.collection

import scala.collection.immutable.VectorBuilder

trait RichIterator[A] {
    protected[this] val self: scala.collection.Iterator[A]

    def infinitBuffered: InfinitBufferedIterator[A] = {
      new InfinitBufferedIterator[A] {
        val intern = self
      }
    }

    def forceTake(n: Int): IndexedSeq[A] = {
      val builder = new VectorBuilder[A]
      0 until n foreach {
        _ =>
          if (self.hasNext) {
            builder += self.next
          }
      }
      builder.result
    }

    def forceDrop(n: Int): this.type = {
      0 until n foreach {
        _ =>
          if (self.hasNext) {
            self.next
          }
      }
      this
    }
}