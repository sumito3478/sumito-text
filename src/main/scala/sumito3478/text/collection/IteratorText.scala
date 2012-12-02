package sumito3478.text.collection

import scala.collection.Iterator

import com.ibm.icu.text.BreakIterator
import com.ibm.icu.util.ULocale

import IteratorText.DefaultGraphemeBreakIterator
import sumito3478.collection.IteratorView
import sumito3478.collection.immutable.ThreadLocal
import sumito3478.text.CodePoint
import sumito3478.text.Grapheme
import sumito3478.text.Line
import sumito3478.text.Sentence
import sumito3478.text.Word
import sumito3478.text.collection.immutable.StringText

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
    IteratorView[Char, Int, BufferedIterator[Char]](buffered) {
      it =>
        val high = it.next
        if (hasNext && CodePoint.isSurrogatePair(high, it.head)) {
          CodePoint(high, it.next)
        } else {
          high
        }
    }
  }

  /**
   * Not implemented yet.
   */
  def graphemeIterator: Iterator[Grapheme] = {
    // TODO: implement by CharacterIterator
    // TODO: implement by myself
    new Iterator[Grapheme] {
      private[this] val str = readString

      private[this] val breaker = IteratorText.DefaultGraphemeBreakIterator()
      breaker.setText(str)

      private[this] var start = breaker.first

      private[this] var end = breaker.next

      def hasNext: Boolean = {
        end != BreakIterator.DONE
      }

      def next: Grapheme = {
        val ret = new Grapheme(new StringText(str.substring(start, end)))
        start = end
        end = breaker.next
        ret
      }
    }
  }
  def wordIterator: Iterator[Word] = {
    throw new NotImplementedError
  }

  /**
   * Not implemented yet.
   */
  def lineIterator: Iterator[Line] = {
    throw new NotImplementedError
  }

  /**
   * Not implemented yet.
   */
  def sentenceIterator: Iterator[Sentence] = {
    throw new NotImplementedError
  }
}

object IteratorText {
  implicit def apply(it: Iterator[Char]): IteratorText = {
    throw new NotImplementedError
  }

  lazy val DefaultGraphemeBreakIterator: ThreadLocal[BreakIterator] = {
    throw new NotImplementedError
  }
}
