package sumito3478.text

import scala.collection.mutable.{ Seq => MutableSeq }

class CodePoint(val value: Int) extends AnyVal {
  def toChars: IndexedSeq[Char] = {
    Character.toChars(value)
  }
}

object CodePoint {

}
