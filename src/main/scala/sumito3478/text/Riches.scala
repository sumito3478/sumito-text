package sumito3478.text

import com.ibm.icu.text.BreakIterator

object Riches {
  implicit class RBreakIterator(
      val self: BreakIterator) extends RichBreakIterator
}
