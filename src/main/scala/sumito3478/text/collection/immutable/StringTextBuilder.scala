package sumito3478.text.collection.immutable

import scala.collection.mutable.StringBuilder

import sumito3478.text.collection.IterableTextLikeBuilder

class StringTextBuilder extends IterableTextLikeBuilder[StringText] {
  private[this] val intern: StringBuilder = new StringBuilder

  def +=(elem: Char): StringTextBuilder.this.type = {
    intern += elem
    StringTextBuilder.this
  }

  def clear(): Unit = {
    intern.clear
  }

  def result: StringText = {
    new StringText(intern.result)
  }
}
