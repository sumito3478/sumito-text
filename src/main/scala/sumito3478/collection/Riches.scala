package sumito3478.collection

import scala.collection.immutable.VectorBuilder

object Riches {
  implicit class RIterator[A](
    val self: scala.collection.Iterator[A]) extends RichIterator[A]
}