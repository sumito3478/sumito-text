package sumito3478.text.collection

import scala.collection.Iterator
import com.ibm.icu.text.BreakIterator
import com.ibm.icu.util.ULocale
import IteratorText.DefaultGraphemeBreakIterator
import sumito3478.collection.ThreadLocal
import sumito3478.text.CodePoint
import sumito3478.text.Grapheme
import sumito3478.text.Line
import sumito3478.text.Sentence
import sumito3478.text.Word
import sumito3478.text.collection.immutable.StringText
import sumito3478.text.locale.Locale

trait IteratorText extends Iterator[Char] {
  def readString: String = {
    val builder = new StringBuilder
    builder ++= this
    builder.result
  }
  /**
   * Creates a iterator over all code points of the text produced by this
   * iterator.
   *
   * @return A new iterator over all code points of the text produced by this
   * iterator.
   *
   * @note The next method of this iterator, if the next 2 code units are a
   * surrogate pair, consumes 2 code units and returns the code point that they
   * consists. Otherwise it consumes 1 code unit and returns it as a code point.
   *
   * @note Reuse: After calling this method, one should discard the iterator it
   * was called on, and use only the iterator that was returned. Using the old
   * iterator is undefined, subject to change, and may result in changes to the
   * new iterator as well.
   */
  def codePointIterator: Iterator[Int] = {
    val it = buffered
    Iterator.continually[Option[Int]](
      if (it.hasNext) {
        it.next match {
          case high if it.hasNext && CodePoint.isSurrogatePair(high, it.head) =>
            Some[Int](CodePoint(high, it.next))
          case high => Some[Int](high)
        }
      } else {
        None
      }).takeWhile(_.isDefined).map(_.get)
  }

  def graphemeIterator: Iterator[Grapheme] = {
    Locale.neutral.mapToGraphemes(this)
  }

  def wordIterator: Iterator[Word] = {
    Locale.neutral.mapToWords(this)
  }

  def lineIterator: Iterator[Line] = {
    Locale.neutral.mapToLines(this)
  }

  def sentenceIterator: Iterator[Sentence] = {
    Locale.neutral.mapToSentences(this)
  }
}

object IteratorText {
  implicit def apply(it: Iterator[Char]): IteratorText = {
    new IteratorText {
      def hasNext = it.hasNext

      def next = it.next
    }
  }

  lazy val DefaultGraphemeBreakIterator: ThreadLocal[BreakIterator] = {
    ThreadLocal[BreakIterator] {
      () =>
        BreakIterator.getCharacterInstance(ULocale.ENGLISH)
    }
  }
}
