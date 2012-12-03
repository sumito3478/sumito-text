package sumito3478.text.collection

import scala.collection.IterableLike

import sumito3478.text.Grapheme
import sumito3478.text.Line
import sumito3478.text.Sentence
import sumito3478.text.Word

trait IterableTextLike[+Repr] extends IterableLike[Char, Repr]
  with Ordered[IterableTextLike[Any]] {
  def newBuilder: IterableTextLikeBuilder[Repr]

  def compare(other: IterableTextLike[Any]): Int = {
    val sit = codePointIterator
    val oit = other.codePointIterator
    Iterator.continually(sit.next - oit.next).dropWhile(
        _ == 0 && sit.hasNext && oit.hasNext).next() match {
      case d if d > 0 => 1
      case d if d < 0 => -1
      case _ if sit.hasNext => 1
      case _ if oit.hasNext => -1
      case _ => 0
    }
  }

  def iteratorText: IteratorText = {
    iterator
  }
  /**
   * Creates a new textIterator over all code points contained in this text object.
   *
   * @return a new textIterator over all code points contained in this text object.
   *
   * @note The next method of this textIterator, if the next 2 code units are a
   * surrogate pair, consumes 2 code units and returns the code point that they
   * consists. Otherwise it consumes 1 code unit and returns it as a code point.
   */
  def codePointIterator: Iterator[Int] = {
    iteratorText.codePointIterator
  }

  /**
   * Not implemented yet.
   */
  def graphemeIterator: Iterator[Grapheme] = {
    iteratorText.graphemeIterator
  }

  /**
   * Not implemented yet.
   */
  def wordIterator: Iterator[Word] = {
    iteratorText.wordIterator
  }

  /**
   * Not implemented yet.
   */
  def lineIterator: Iterator[Line] = {
    iteratorText.lineIterator
  }

  /**
   * Not implemented yet.
   */
  def sentenceIterator: Iterator[Sentence] = {
    iteratorText.sentenceIterator
  }

  //  def toUpperCase: Repr = {
  //    val builder = newBuilder
  //    
  //    builder.result
  //  }
  /**
   * Converts all of the characters in this text to upper case using the default
   * rule.
   *
   * @return the text newly created, converted to uppercase.
   *
   * @note Note: while java.lang.String#toUpperCase uses the default locale,
   * which is varies per JVM setting, this method always use the 'default rule'.
   */
  def toUpperCase: Repr

  /**
   * Converts all of the characters in this text to lower case using the default
   * rule.
   *
   * @return the text newly created, converted to lowercase.
   *
   * @note Note: while java.lang.String#toUpperCase uses the default locale,
   * which is varies per JVM setting, this method always use the 'default rule'.
   */
  def toLowerCase: Repr
}
