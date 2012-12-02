package sumito3478.text.collection.immutable

import java.util.Locale

import scala.collection.immutable.IndexedSeq

import com.ibm.icu.util.ULocale

class StringText(val intern: String) extends IndexedSeqTextLike[StringText] {
  override def newBuilder: StringTextBuilder = new StringTextBuilder

  def apply(idx: Int): Char = {
    intern charAt idx
  }

  def length: Int = {
    intern.length
  }

  def seq: IndexedSeq[Char] = {
    val self = this
    new IndexedSeq[Char] {
      def apply(idx: Int): Char = {
        self(idx)
      }

      def length: Int = {
        self.length
      }
    }
  }

  override def toString: String = {
    intern
  }

  def toUpperCase: StringText = {
    // TODO: implement the conversion rule by myself
    new StringText(intern.toUpperCase(StringText.defaultRuleJLocale))
  }

  def toLowerCase: StringText = {
    // TODO: implement the conversion rule by myself
    new StringText(intern.toLowerCase(StringText.defaultRuleJLocale))
  }
}

object StringText {
  private val defaultRuleULocale: ULocale = {
    ULocale.ENGLISH
  }

  private val defaultRuleJLocale: Locale = {
    defaultRuleULocale.toLocale
  }
}
