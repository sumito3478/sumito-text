package sumito3478.text

import org.specs2.mutable.SpecificationWithJUnit

class UnicodeBlockSpec extends SpecificationWithJUnit {
  "UnicodeBlock.apply" should {
    "returns UnicodeBlock.BasicLatin for 'a'" in {
      UnicodeBlock('a').isInstanceOf[UnicodeBlock.BasicLatin] must beTrue
    }

    "returns UnicodeBlock.Greek for Unicode Character 'GREEK SMALL LETTER ALPHA' (U+03B1)" in {
      UnicodeBlock(0x3b1).isInstanceOf[UnicodeBlock.Greek] must beTrue
    }
  }
}