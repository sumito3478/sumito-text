package sumito3478.text.io

import java.io.BufferedReader
import java.io.FileInputStream
import java.io.InputStream
import java.io.InputStreamReader
import java.nio.charset.Charset

import scala.collection.Iterator

import sumito3478.text.collection.IteratorText

trait Source extends IteratorText {
  protected[this] val bufferSize: Int = 2048

  protected[this] val charset: Charset

  protected[this] val byteStream: InputStream

  private[this] val bufferedReader: BufferedReader = {
    new BufferedReader(
      new InputStreamReader(byteStream, charset), bufferSize)
  }

  private[this] val infinitBufferedIterator: BufferedIterator[Char] = {
    new Iterator[Char] {
      def hasNext: Boolean = true

      def next: Char = {
        bufferedReader.read().toChar
      }
    }.buffered
  }

  def hasNext: Boolean = {
    infinitBufferedIterator.head != -1
  }

  def next: Char = {
    infinitBufferedIterator.next
  }

  private def close: Unit = {
    byteStream.close
  }
}

object Source {
  def fromFile(
    fileName: String, decoder: Charset)(f: (Source) => Unit): Unit = {
    val source: Source = new Source {
      val charset: Charset = decoder

      val byteStream: InputStream = {
        new FileInputStream(fileName)
      }
    }
    try {
      f(source)
    } finally {
      source.close
    }
  }
}
