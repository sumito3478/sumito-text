package sumito3478.text

object UnicodeBlock {
  def apply(codePoint: CodePoint): UnicodeBlock = {
    import Character.UnicodeBlock._
    of(codePoint) match {
      case BASIC_LATIN => BasicLatin(codePoint)
      case LATIN_1_SUPPLEMENT => Latin1Supplement(codePoint)
      case LATIN_EXTENDED_A => LatinExtendedA(codePoint)
      case LATIN_EXTENDED_B => LatinExtendedB(codePoint)
      case IPA_EXTENSIONS => IpaExtensions(codePoint)
      case SPACING_MODIFIER_LETTERS => SpacingModifierLetters(codePoint)
      case COMBINING_DIACRITICAL_MARKS => CombiningDiacriticalMarks(codePoint)
      case GREEK => Greek(codePoint)
      case CYRILLIC => Cyrillic(codePoint)
      case ARMENIAN => Armenian(codePoint)
      case HEBREW => Hebrew(codePoint)
      case ARABIC => Arabic(codePoint)
      case DEVANAGARI => Devanagari(codePoint)
      case BENGALI => Bengali(codePoint)
      case GURMUKHI => Gurmukhi(codePoint)
      case GUJARATI => Gujarati(codePoint)
      case ORIYA => Oriya(codePoint)
      case TAMIL => Tamil(codePoint)
      case TELUGU => Telugu(codePoint)
      case KANNADA => Kannada(codePoint)
      case MALAYALAM => Malayalam(codePoint)
      case THAI => Thai(codePoint)
      case LAO => Lao(codePoint)
      case TIBETAN => Tibetan(codePoint)
      case GEORGIAN => Georgian(codePoint)
      case HANGUL_JAMO => HangulJamo(codePoint)
      case LATIN_EXTENDED_ADDITIONAL => LatinExtendedAdditional(codePoint)
      case GREEK_EXTENDED => GreekExtended(codePoint)
      case GENERAL_PUNCTUATION => GeneralPunctuation(codePoint)
      case SUPERSCRIPTS_AND_SUBSCRIPTS => SuperscriptsAndSubscripts(codePoint)
      case CURRENCY_SYMBOLS => CurrencySymbols(codePoint)
      case COMBINING_MARKS_FOR_SYMBOLS => CombiningMarksForSymbols(codePoint)
      case LETTERLIKE_SYMBOLS => LetterlikeSymbols(codePoint)
      case NUMBER_FORMS => NumberForms(codePoint)
      case ARROWS => Arrows(codePoint)
      case MATHEMATICAL_OPERATORS => MathematicalOperators(codePoint)
      case MISCELLANEOUS_TECHNICAL => MiscellaneousTechnical(codePoint)
      case CONTROL_PICTURES => ControlPictures(codePoint)
      case OPTICAL_CHARACTER_RECOGNITION => OpticalCharacterRecognition(codePoint)
      case ENCLOSED_ALPHANUMERICS => EnclosedAlphanumerics(codePoint)
      case BOX_DRAWING => BoxDrawing(codePoint)
      case BLOCK_ELEMENTS => BlockElements(codePoint)
      case GEOMETRIC_SHAPES => GeometricShapes(codePoint)
      case MISCELLANEOUS_SYMBOLS => MiscellaneousSymbols(codePoint)
      case DINGBATS => Dingbats(codePoint)
      case CJK_SYMBOLS_AND_PUNCTUATION => CjkSymbolsAndPunctuation(codePoint)
      case HIRAGANA => Hiragana(codePoint)
      case KATAKANA => Katakana(codePoint)
      case BOPOMOFO => Bopomofo(codePoint)
      case HANGUL_COMPATIBILITY_JAMO => HangulCompatibilityJamo(codePoint)
      case KANBUN => Kanbun(codePoint)
      case ENCLOSED_CJK_LETTERS_AND_MONTHS => EnclosedCjkLettersAndMonths(codePoint)
      case CJK_COMPATIBILITY => CjkCompatibility(codePoint)
      case CJK_UNIFIED_IDEOGRAPHS => CjkUnifiedIdeographs(codePoint)
      case HANGUL_SYLLABLES => HangulSyllables(codePoint)
      case PRIVATE_USE_AREA => PrivateUseArea(codePoint)
      case CJK_COMPATIBILITY_IDEOGRAPHS => CjkCompatibilityIdeographs(codePoint)
      case ALPHABETIC_PRESENTATION_FORMS => AlphabeticPresentationForms(codePoint)
      case ARABIC_PRESENTATION_FORMS_A => ArabicPresentationFormsA(codePoint)
      case COMBINING_HALF_MARKS => CombiningHalfMarks(codePoint)
      case CJK_COMPATIBILITY_FORMS => CjkCompatibilityForms(codePoint)
      case SMALL_FORM_VARIANTS => SmallFormVariants(codePoint)
      case ARABIC_PRESENTATION_FORMS_B => ArabicPresentationFormsB(codePoint)
      case HALFWIDTH_AND_FULLWIDTH_FORMS => HalfwidthAndFullwidthForms(codePoint)
      case SPECIALS => Specials(codePoint)
      case SURROGATES_AREA => SurrogatesArea(codePoint)
      case SYRIAC => Syriac(codePoint)
      case THAANA => Thaana(codePoint)
      case SINHALA => Sinhala(codePoint)
      case MYANMAR => Myanmar(codePoint)
      case ETHIOPIC => Ethiopic(codePoint)
      case CHEROKEE => Cherokee(codePoint)
      case UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS => UnifiedCanadianAboriginalSyllabics(codePoint)
      case OGHAM => Ogham(codePoint)
      case RUNIC => Runic(codePoint)
      case KHMER => Khmer(codePoint)
      case MONGOLIAN => Mongolian(codePoint)
      case BRAILLE_PATTERNS => BraillePatterns(codePoint)
      case CJK_RADICALS_SUPPLEMENT => CjkRadicalsSupplement(codePoint)
      case KANGXI_RADICALS => KangxiRadicals(codePoint)
      case IDEOGRAPHIC_DESCRIPTION_CHARACTERS => IdeographicDescriptionCharacters(codePoint)
      case BOPOMOFO_EXTENDED => BopomofoExtended(codePoint)
      case CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A => CjkUnifiedIdeographsExtensionA(codePoint)
      case YI_SYLLABLES => YiSyllables(codePoint)
      case YI_RADICALS => YiRadicals(codePoint)
      case CYRILLIC_SUPPLEMENTARY => CyrillicSupplementary(codePoint)
      case TAGALOG => Tagalog(codePoint)
      case HANUNOO => Hanunoo(codePoint)
      case BUHID => Buhid(codePoint)
      case TAGBANWA => Tagbanwa(codePoint)
      case LIMBU => Limbu(codePoint)
      case TAI_LE => TaiLe(codePoint)
      case KHMER_SYMBOLS => KhmerSymbols(codePoint)
      case PHONETIC_EXTENSIONS => PhoneticExtensions(codePoint)
      case MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A => MiscellaneousMathematicalSymbolsA(codePoint)
      case SUPPLEMENTAL_ARROWS_A => SupplementalArrowsA(codePoint)
      case SUPPLEMENTAL_ARROWS_B => SupplementalArrowsB(codePoint)
      case MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B => MiscellaneousMathematicalSymbolsB(codePoint)
      case SUPPLEMENTAL_MATHEMATICAL_OPERATORS => SupplementalMathematicalOperators(codePoint)
      case MISCELLANEOUS_SYMBOLS_AND_ARROWS => MiscellaneousSymbolsAndArrows(codePoint)
      case KATAKANA_PHONETIC_EXTENSIONS => KatakanaPhoneticExtensions(codePoint)
      case YIJING_HEXAGRAM_SYMBOLS => YijingHexagramSymbols(codePoint)
      case VARIATION_SELECTORS => VariationSelectors(codePoint)
      case LINEAR_B_SYLLABARY => LinearBSyllabary(codePoint)
      case LINEAR_B_IDEOGRAMS => LinearBIdeograms(codePoint)
      case AEGEAN_NUMBERS => AegeanNumbers(codePoint)
      case OLD_ITALIC => OldItalic(codePoint)
      case GOTHIC => Gothic(codePoint)
      case UGARITIC => Ugaritic(codePoint)
      case DESERET => Deseret(codePoint)
      case SHAVIAN => Shavian(codePoint)
      case OSMANYA => Osmanya(codePoint)
      case CYPRIOT_SYLLABARY => CypriotSyllabary(codePoint)
      case BYZANTINE_MUSICAL_SYMBOLS => ByzantineMusicalSymbols(codePoint)
      case MUSICAL_SYMBOLS => MusicalSymbols(codePoint)
      case TAI_XUAN_JING_SYMBOLS => TaiXuanJingSymbols(codePoint)
      case MATHEMATICAL_ALPHANUMERIC_SYMBOLS => MathematicalAlphanumericSymbols(codePoint)
      case CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B => CjkUnifiedIdeographsExtensionB(codePoint)
      case CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT => CjkCompatibilityIdeographsSupplement(codePoint)
      case TAGS => Tags(codePoint)
      case VARIATION_SELECTORS_SUPPLEMENT => VariationSelectorsSupplement(codePoint)
      case SUPPLEMENTARY_PRIVATE_USE_AREA_A => SupplementaryPrivateUseAreaA(codePoint)
      case SUPPLEMENTARY_PRIVATE_USE_AREA_B => SupplementaryPrivateUseAreaB(codePoint)
      case HIGH_SURROGATES => HighSurrogates(codePoint)
      case HIGH_PRIVATE_USE_SURROGATES => HighPrivateUseSurrogates(codePoint)
      case LOW_SURROGATES => LowSurrogates(codePoint)
      case ARABIC_SUPPLEMENT => ArabicSupplement(codePoint)
      case NKO => Nko(codePoint)
      case SAMARITAN => Samaritan(codePoint)
      case MANDAIC => Mandaic(codePoint)
      case ETHIOPIC_SUPPLEMENT => EthiopicSupplement(codePoint)
      case UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED => UnifiedCanadianAboriginalSyllabicsExtended(codePoint)
      case NEW_TAI_LUE => NewTaiLue(codePoint)
      case BUGINESE => Buginese(codePoint)
      case TAI_THAM => TaiTham(codePoint)
      case BALINESE => Balinese(codePoint)
      case SUNDANESE => Sundanese(codePoint)
      case BATAK => Batak(codePoint)
      case LEPCHA => Lepcha(codePoint)
      case OL_CHIKI => OlChiki(codePoint)
      case VEDIC_EXTENSIONS => VedicExtensions(codePoint)
      case PHONETIC_EXTENSIONS_SUPPLEMENT => PhoneticExtensionsSupplement(codePoint)
      case COMBINING_DIACRITICAL_MARKS_SUPPLEMENT => CombiningDiacriticalMarksSupplement(codePoint)
      case GLAGOLITIC => Glagolitic(codePoint)
      case LATIN_EXTENDED_C => LatinExtendedC(codePoint)
      case COPTIC => Coptic(codePoint)
      case GEORGIAN_SUPPLEMENT => GeorgianSupplement(codePoint)
      case TIFINAGH => Tifinagh(codePoint)
      case ETHIOPIC_EXTENDED => EthiopicExtended(codePoint)
      case CYRILLIC_EXTENDED_A => CyrillicExtendedA(codePoint)
      case SUPPLEMENTAL_PUNCTUATION => SupplementalPunctuation(codePoint)
      case CJK_STROKES => CjkStrokes(codePoint)
      case LISU => Lisu(codePoint)
      case VAI => Vai(codePoint)
      case CYRILLIC_EXTENDED_B => CyrillicExtendedB(codePoint)
      case BAMUM => Bamum(codePoint)
      case MODIFIER_TONE_LETTERS => ModifierToneLetters(codePoint)
      case LATIN_EXTENDED_D => LatinExtendedD(codePoint)
      case SYLOTI_NAGRI => SylotiNagri(codePoint)
      case COMMON_INDIC_NUMBER_FORMS => CommonIndicNumberForms(codePoint)
      case PHAGS_PA => PhagsPa(codePoint)
      case SAURASHTRA => Saurashtra(codePoint)
      case DEVANAGARI_EXTENDED => DevanagariExtended(codePoint)
      case KAYAH_LI => KayahLi(codePoint)
      case REJANG => Rejang(codePoint)
      case HANGUL_JAMO_EXTENDED_A => HangulJamoExtendedA(codePoint)
      case JAVANESE => Javanese(codePoint)
      case CHAM => Cham(codePoint)
      case MYANMAR_EXTENDED_A => MyanmarExtendedA(codePoint)
      case TAI_VIET => TaiViet(codePoint)
      case ETHIOPIC_EXTENDED_A => EthiopicExtendedA(codePoint)
      case MEETEI_MAYEK => MeeteiMayek(codePoint)
      case HANGUL_JAMO_EXTENDED_B => HangulJamoExtendedB(codePoint)
      case VERTICAL_FORMS => VerticalForms(codePoint)
      case ANCIENT_GREEK_NUMBERS => AncientGreekNumbers(codePoint)
      case ANCIENT_SYMBOLS => AncientSymbols(codePoint)
      case PHAISTOS_DISC => PhaistosDisc(codePoint)
      case LYCIAN => Lycian(codePoint)
      case CARIAN => Carian(codePoint)
      case OLD_PERSIAN => OldPersian(codePoint)
      case IMPERIAL_ARAMAIC => ImperialAramaic(codePoint)
      case PHOENICIAN => Phoenician(codePoint)
      case LYDIAN => Lydian(codePoint)
      case KHAROSHTHI => Kharoshthi(codePoint)
      case OLD_SOUTH_ARABIAN => OldSouthArabian(codePoint)
      case AVESTAN => Avestan(codePoint)
      case INSCRIPTIONAL_PARTHIAN => InscriptionalParthian(codePoint)
      case INSCRIPTIONAL_PAHLAVI => InscriptionalPahlavi(codePoint)
      case OLD_TURKIC => OldTurkic(codePoint)
      case RUMI_NUMERAL_SYMBOLS => RumiNumeralSymbols(codePoint)
      case BRAHMI => Brahmi(codePoint)
      case KAITHI => Kaithi(codePoint)
      case CUNEIFORM => Cuneiform(codePoint)
      case CUNEIFORM_NUMBERS_AND_PUNCTUATION => CuneiformNumbersAndPunctuation(codePoint)
      case EGYPTIAN_HIEROGLYPHS => EgyptianHieroglyphs(codePoint)
      case BAMUM_SUPPLEMENT => BamumSupplement(codePoint)
      case KANA_SUPPLEMENT => KanaSupplement(codePoint)
      case ANCIENT_GREEK_MUSICAL_NOTATION => AncientGreekMusicalNotation(codePoint)
      case COUNTING_ROD_NUMERALS => CountingRodNumerals(codePoint)
      case MAHJONG_TILES => MahjongTiles(codePoint)
      case DOMINO_TILES => DominoTiles(codePoint)
      case PLAYING_CARDS => PlayingCards(codePoint)
      case ENCLOSED_ALPHANUMERIC_SUPPLEMENT => EnclosedAlphanumericSupplement(codePoint)
      case ENCLOSED_IDEOGRAPHIC_SUPPLEMENT => EnclosedIdeographicSupplement(codePoint)
      case MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS => MiscellaneousSymbolsAndPictographs(codePoint)
      case EMOTICONS => Emoticons(codePoint)
      case TRANSPORT_AND_MAP_SYMBOLS => TransportAndMapSymbols(codePoint)
      case ALCHEMICAL_SYMBOLS => AlchemicalSymbols(codePoint)
      case CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C => CjkUnifiedIdeographsExtensionC(codePoint)
      case CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D => CjkUnifiedIdeographsExtensionD(codePoint)
    }
  }
  case class BasicLatin private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Latin1Supplement private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class LatinExtendedA private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class LatinExtendedB private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class IpaExtensions private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class SpacingModifierLetters private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CombiningDiacriticalMarks private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Greek private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Cyrillic private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Armenian private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Hebrew private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Arabic private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Devanagari private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Bengali private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Gurmukhi private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Gujarati private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Oriya private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Tamil private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Telugu private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Kannada private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Malayalam private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Thai private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Lao private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Tibetan private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Georgian private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class HangulJamo private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class LatinExtendedAdditional private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class GreekExtended private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class GeneralPunctuation private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class SuperscriptsAndSubscripts private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CurrencySymbols private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CombiningMarksForSymbols private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class LetterlikeSymbols private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class NumberForms private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Arrows private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class MathematicalOperators private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class MiscellaneousTechnical private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class ControlPictures private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class OpticalCharacterRecognition private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class EnclosedAlphanumerics private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class BoxDrawing private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class BlockElements private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class GeometricShapes private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class MiscellaneousSymbols private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Dingbats private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CjkSymbolsAndPunctuation private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Hiragana private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Katakana private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Bopomofo private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class HangulCompatibilityJamo private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Kanbun private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class EnclosedCjkLettersAndMonths private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CjkCompatibility private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CjkUnifiedIdeographs private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class HangulSyllables private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class PrivateUseArea private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CjkCompatibilityIdeographs private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class AlphabeticPresentationForms private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class ArabicPresentationFormsA private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CombiningHalfMarks private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CjkCompatibilityForms private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class SmallFormVariants private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class ArabicPresentationFormsB private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class HalfwidthAndFullwidthForms private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Specials private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class SurrogatesArea private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Syriac private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Thaana private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Sinhala private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Myanmar private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Ethiopic private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Cherokee private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class UnifiedCanadianAboriginalSyllabics private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Ogham private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Runic private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Khmer private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Mongolian private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class BraillePatterns private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CjkRadicalsSupplement private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class KangxiRadicals private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class IdeographicDescriptionCharacters private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class BopomofoExtended private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CjkUnifiedIdeographsExtensionA private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class YiSyllables private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class YiRadicals private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CyrillicSupplementary private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Tagalog private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Hanunoo private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Buhid private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Tagbanwa private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Limbu private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class TaiLe private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class KhmerSymbols private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class PhoneticExtensions private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class MiscellaneousMathematicalSymbolsA private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class SupplementalArrowsA private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class SupplementalArrowsB private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class MiscellaneousMathematicalSymbolsB private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class SupplementalMathematicalOperators private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class MiscellaneousSymbolsAndArrows private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class KatakanaPhoneticExtensions private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class YijingHexagramSymbols private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class VariationSelectors private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class LinearBSyllabary private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class LinearBIdeograms private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class AegeanNumbers private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class OldItalic private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Gothic private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Ugaritic private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Deseret private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Shavian private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Osmanya private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CypriotSyllabary private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class ByzantineMusicalSymbols private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class MusicalSymbols private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class TaiXuanJingSymbols private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class MathematicalAlphanumericSymbols private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CjkUnifiedIdeographsExtensionB private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CjkCompatibilityIdeographsSupplement private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Tags private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class VariationSelectorsSupplement private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class SupplementaryPrivateUseAreaA private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class SupplementaryPrivateUseAreaB private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class HighSurrogates private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class HighPrivateUseSurrogates private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class LowSurrogates private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class ArabicSupplement private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Nko private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Samaritan private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Mandaic private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class EthiopicSupplement private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class UnifiedCanadianAboriginalSyllabicsExtended private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class NewTaiLue private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Buginese private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class TaiTham private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Balinese private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Sundanese private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Batak private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Lepcha private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class OlChiki private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class VedicExtensions private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class PhoneticExtensionsSupplement private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CombiningDiacriticalMarksSupplement private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Glagolitic private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class LatinExtendedC private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Coptic private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class GeorgianSupplement private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Tifinagh private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class EthiopicExtended private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CyrillicExtendedA private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class SupplementalPunctuation private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CjkStrokes private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Lisu private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Vai private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CyrillicExtendedB private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Bamum private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class ModifierToneLetters private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class LatinExtendedD private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class SylotiNagri private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CommonIndicNumberForms private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class PhagsPa private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Saurashtra private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class DevanagariExtended private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class KayahLi private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Rejang private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class HangulJamoExtendedA private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Javanese private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Cham private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class MyanmarExtendedA private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class TaiViet private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class EthiopicExtendedA private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class MeeteiMayek private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class HangulJamoExtendedB private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class VerticalForms private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class AncientGreekNumbers private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class AncientSymbols private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class PhaistosDisc private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Lycian private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Carian private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class OldPersian private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class ImperialAramaic private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Phoenician private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Lydian private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Kharoshthi private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class OldSouthArabian private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Avestan private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class InscriptionalParthian private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class InscriptionalPahlavi private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class OldTurkic private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class RumiNumeralSymbols private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Brahmi private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Kaithi private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Cuneiform private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CuneiformNumbersAndPunctuation private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class EgyptianHieroglyphs private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class BamumSupplement private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class KanaSupplement private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class AncientGreekMusicalNotation private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CountingRodNumerals private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class MahjongTiles private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class DominoTiles private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class PlayingCards private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class EnclosedAlphanumericSupplement private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class EnclosedIdeographicSupplement private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class MiscellaneousSymbolsAndPictographs private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class Emoticons private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class TransportAndMapSymbols private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class AlchemicalSymbols private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CjkUnifiedIdeographsExtensionC private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
  case class CjkUnifiedIdeographsExtensionD private[UnicodeBlock] (val codePoint: CodePoint) extends UnicodeBlock
}

abstract class UnicodeBlock

