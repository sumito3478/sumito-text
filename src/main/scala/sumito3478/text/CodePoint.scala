package sumito3478.text

import scala.collection.mutable.{ Seq => MutableSeq }

import java.lang.{ Character => Ops }

class CodePoint(val intern: Int) extends AnyVal {
  def toChars: IndexedSeq[Char] = {
    Ops.toChars(intern)
  }

  def digit(radix: Int): Int = {
    Ops.digit(intern, radix)
  }

  def name: String = {
    Ops.getName(intern)
  }

  def toNumeric(): Int = {
    Ops.getNumericValue(intern)
  }

  // def getType(): Int = ...

  def isAlphabetic(): Boolean = {
    Ops.isAlphabetic(intern)
  }

  def isBmpCodePoint(): Boolean = {
    Ops.isBmpCodePoint(intern)
  }

  def isDefined(): Boolean = {
    Ops.isDefined(intern)
  }

  def isDigit(): Boolean = {
    Ops.isDigit(intern)
  }

  def isIdentifierIgnorable(): Boolean = {
    Ops.isIdentifierIgnorable(intern)
  }

  def isIdeographic(): Boolean = {
    Ops.isIdeographic(intern)
  }

  def isISOControl(): Boolean = {
    Ops.isISOControl(intern)
  }

  def isJavaIdentifierPart(): Boolean = {
    Ops.isJavaIdentifierPart(intern)
  }

  def isLetter(): Boolean = {
    Ops.isLetter(intern)
  }

  def isLetterOrDigit(): Boolean = {
    Ops.isLetterOrDigit(intern)
  }

  def isLowerCase(): Boolean = {
    Ops.isLowerCase(intern)
  }

  def isMirrored(): Boolean = {
    Ops.isMirrored(intern)
  }

  def isSpaceChar(): Boolean = {
    Ops.isSpaceChar(intern)
  }

  def isSupplementaryCodePoint(): Boolean = {
    Ops.isSupplementaryCodePoint(intern)
  }

  def isTitleCase(): Boolean = {
    Ops.isTitleCase(intern)
  }

  def isUnicodeIdentifierPart(): Boolean = {
    Ops.isUnicodeIdentifierPart(intern)
  }

  def isUpperCase(): Boolean = {
    Ops.isUpperCase(intern)
  }

  def isValidCodePoint(): Boolean = {
    Ops.isValidCodePoint(intern)
  }

  def isWhiteSpace(): Boolean = {
    Ops.isWhitespace(intern)
  }

  def toTitleCase(): CodePoint = {
    new CodePoint(Ops.toTitleCase(intern))
  }

  // def toUpperCase ...
  // def toLowerCase ...
}

object CodePoint {
  implicit def fromInt(value: Int): CodePoint = {
    new CodePoint(value)
  }

  implicit def toInt(codePoint: CodePoint): Int = {
    codePoint.intern
  }

  def isSurrogatePair(high: Char, low: Char): Boolean = {
    Ops.isSurrogatePair(high, low)
  }

  def apply(high: Char, low: Char): CodePoint = {
    Ops.toCodePoint(high, low)
  }

  def apply(digit: Int, radix: Int): CodePoint = {
    Ops.forDigit(digit, radix)
  }
}
