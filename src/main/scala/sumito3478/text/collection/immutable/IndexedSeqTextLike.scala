package sumito3478.text.collection.immutable

import scala.collection.IndexedSeqOptimized

import sumito3478.text.collection.IterableTextLike

trait IndexedSeqTextLike[+Repr] extends IndexedSeqOptimized[Char, Repr]
  with IterableTextLike[Repr] {
}
