package sumito3478.text.collection

import scala.collection.mutable.Builder

import sumito3478.text.CodePoint

trait IterableTextLikeBuilder[+To] extends Builder[Char, To] {
  def +=(elem: CodePoint): this.type = {
    ++=(elem.toChars)
    this
  }

  def ++=(xs: TraversableOnce[Int]): this.type = {
    xs foreach {
      c =>
        +=(c)
    }
    this
  }
}
