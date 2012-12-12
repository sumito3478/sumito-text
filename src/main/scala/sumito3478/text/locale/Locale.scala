package sumito3478.text.locale

import sumito3478.text.Grapheme
import sumito3478.text.CodePoint
import sumito3478.text.Line
import sumito3478.text.Word
import sumito3478.text.Sentence
import com.ibm.icu.util.ULocale

trait Locale {
  def mapToGraphemes(text: Iterator[Char]): Iterator[Grapheme]
  
  def mapToWords(text: Iterator[Char]): Iterator[Word]
  
  def mapToLines(text: Iterator[Char]): Iterator[Line]
  
  def mapToSentences(text: Iterator[Char]): Iterator[Sentence]
}

object Locale {
  lazy val neutral: Locale = {
    /* TODO: implement by myself */
    new ICULocale(ULocale.ENGLISH)
  }
}
