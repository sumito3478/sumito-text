package sumito3478.text

import scala.collection.mutable.{ Seq => MutableSeq }

class CodePoint(val value: Int) extends AnyVal {
  def toChars: IndexedSeq[Char] = {
    Character.toChars(value)
  }
}

object CodePoint {
  implicit def fromInt(value: Int): CodePoint = {
    new CodePoint(value)
  }

  implicit def toInt(codePoint: CodePoint): Int = {
    codePoint.value
  }
}
