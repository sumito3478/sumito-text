package sumito3478.text.locale

import sumito3478.text.Line
import sumito3478.text.Sentence
import sumito3478.text.Grapheme
import sumito3478.text.Word
import com.ibm.icu.util.ULocale
import com.ibm.icu.text.BreakIterator
import scala.collection.mutable.ArrayBuffer
import scala.collection.immutable.VectorBuilder
import scala.collection.immutable.WrappedString
import scala.collection.mutable.Queue
import sumito3478.text.collection.immutable.StringText
import sumito3478.text.Riches.RBreakIterator

class ICULocale(val intern: ULocale) extends Locale {
  def mapToGraphemes(text: Iterator[Char]): Iterator[Grapheme] = {
    BreakIterator.getCharacterInstance(
      intern).mapIterator(text).map(new Grapheme(_))
  }

  def mapToWords(text: Iterator[Char]): Iterator[Word] = {
    BreakIterator.getWordInstance(
      intern).mapIterator(text).map(new Word(_))
  }

  def mapToLines(text: Iterator[Char]): Iterator[Line] = {
    BreakIterator.getLineInstance(
      intern).mapIterator(text).map(new Line(_))
  }

  def mapToSentences(text: Iterator[Char]): Iterator[Sentence] = {
    BreakIterator.getSentenceInstance(
      intern).mapIterator(text).map(new Sentence(_))
  }
}
