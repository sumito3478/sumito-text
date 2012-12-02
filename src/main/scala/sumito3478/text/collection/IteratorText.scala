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
  def codePointIterator: Iterator[Int] = {
    throw new NotImplementedError
  }
  def graphemeIterator: Iterator[Grapheme] = {
    throw new NotImplementedError
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
