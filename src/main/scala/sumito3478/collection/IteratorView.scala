package sumito3478.collection

import scala.collection.Iterator

trait IteratorView[+A] extends Iterator[A] {

}

object IteratorView {
  def apply[A, B, It <: Iterator[A]](it: It)(f: (It) => B): IteratorView[B] = {
    new IteratorView[B] {
      def hasNext: Boolean = {
        it.hasNext
      }

      def next: B = {
        f(it)
      }
    }
  }
}
