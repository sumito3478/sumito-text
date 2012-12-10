package sumito3478.text

object UnicodeBlock {
  def apply(codePoint: CodePoint): UnicodeBlock = {
    import Character.UnicodeBlock._
    val intern = of(codePoint)
    intern match {
      case BASIC_LATIN => BasicLatin(codePoint, intern)
      case LATIN_1_SUPPLEMENT => Latin1Supplement(codePoint, intern)
      case LATIN_EXTENDED_A => LatinExtendedA(codePoint, intern)
      case LATIN_EXTENDED_B => LatinExtendedB(codePoint, intern)
      case IPA_EXTENSIONS => IpaExtensions(codePoint, intern)
      case SPACING_MODIFIER_LETTERS => SpacingModifierLetters(codePoint, intern)
      case COMBINING_DIACRITICAL_MARKS => CombiningDiacriticalMarks(codePoint, intern)
      case GREEK => Greek(codePoint, intern)
      case CYRILLIC => Cyrillic(codePoint, intern)
      case ARMENIAN => Armenian(codePoint, intern)
      case HEBREW => Hebrew(codePoint, intern)
      case ARABIC => Arabic(codePoint, intern)
      case DEVANAGARI => Devanagari(codePoint, intern)
      case BENGALI => Bengali(codePoint, intern)
      case GURMUKHI => Gurmukhi(codePoint, intern)
      case GUJARATI => Gujarati(codePoint, intern)
      case ORIYA => Oriya(codePoint, intern)
      case TAMIL => Tamil(codePoint, intern)
      case TELUGU => Telugu(codePoint, intern)
      case KANNADA => Kannada(codePoint, intern)
      case MALAYALAM => Malayalam(codePoint, intern)
      case THAI => Thai(codePoint, intern)
      case LAO => Lao(codePoint, intern)
      case TIBETAN => Tibetan(codePoint, intern)
      case GEORGIAN => Georgian(codePoint, intern)
      case HANGUL_JAMO => HangulJamo(codePoint, intern)
      case LATIN_EXTENDED_ADDITIONAL => LatinExtendedAdditional(codePoint, intern)
      case GREEK_EXTENDED => GreekExtended(codePoint, intern)
      case GENERAL_PUNCTUATION => GeneralPunctuation(codePoint, intern)
      case SUPERSCRIPTS_AND_SUBSCRIPTS => SuperscriptsAndSubscripts(codePoint, intern)
      case CURRENCY_SYMBOLS => CurrencySymbols(codePoint, intern)
      case COMBINING_MARKS_FOR_SYMBOLS => CombiningMarksForSymbols(codePoint, intern)
      case LETTERLIKE_SYMBOLS => LetterlikeSymbols(codePoint, intern)
      case NUMBER_FORMS => NumberForms(codePoint, intern)
      case ARROWS => Arrows(codePoint, intern)
      case MATHEMATICAL_OPERATORS => MathematicalOperators(codePoint, intern)
      case MISCELLANEOUS_TECHNICAL => MiscellaneousTechnical(codePoint, intern)
      case CONTROL_PICTURES => ControlPictures(codePoint, intern)
      case OPTICAL_CHARACTER_RECOGNITION => OpticalCharacterRecognition(codePoint, intern)
      case ENCLOSED_ALPHANUMERICS => EnclosedAlphanumerics(codePoint, intern)
      case BOX_DRAWING => BoxDrawing(codePoint, intern)
      case BLOCK_ELEMENTS => BlockElements(codePoint, intern)
      case GEOMETRIC_SHAPES => GeometricShapes(codePoint, intern)
      case MISCELLANEOUS_SYMBOLS => MiscellaneousSymbols(codePoint, intern)
      case DINGBATS => Dingbats(codePoint, intern)
      case CJK_SYMBOLS_AND_PUNCTUATION => CjkSymbolsAndPunctuation(codePoint, intern)
      case HIRAGANA => Hiragana(codePoint, intern)
      case KATAKANA => Katakana(codePoint, intern)
      case BOPOMOFO => Bopomofo(codePoint, intern)
      case HANGUL_COMPATIBILITY_JAMO => HangulCompatibilityJamo(codePoint, intern)
      case KANBUN => Kanbun(codePoint, intern)
      case ENCLOSED_CJK_LETTERS_AND_MONTHS => EnclosedCjkLettersAndMonths(codePoint, intern)
      case CJK_COMPATIBILITY => CjkCompatibility(codePoint, intern)
      case CJK_UNIFIED_IDEOGRAPHS => CjkUnifiedIdeographs(codePoint, intern)
      case HANGUL_SYLLABLES => HangulSyllables(codePoint, intern)
      case PRIVATE_USE_AREA => PrivateUseArea(codePoint, intern)
      case CJK_COMPATIBILITY_IDEOGRAPHS => CjkCompatibilityIdeographs(codePoint, intern)
      case ALPHABETIC_PRESENTATION_FORMS => AlphabeticPresentationForms(codePoint, intern)
      case ARABIC_PRESENTATION_FORMS_A => ArabicPresentationFormsA(codePoint, intern)
      case COMBINING_HALF_MARKS => CombiningHalfMarks(codePoint, intern)
      case CJK_COMPATIBILITY_FORMS => CjkCompatibilityForms(codePoint, intern)
      case SMALL_FORM_VARIANTS => SmallFormVariants(codePoint, intern)
      case ARABIC_PRESENTATION_FORMS_B => ArabicPresentationFormsB(codePoint, intern)
      case HALFWIDTH_AND_FULLWIDTH_FORMS => HalfwidthAndFullwidthForms(codePoint, intern)
      case SPECIALS => Specials(codePoint, intern)
      // case SURROGATES_AREA => SurrogatesArea(codePoint, intern)
      case SYRIAC => Syriac(codePoint, intern)
      case THAANA => Thaana(codePoint, intern)
      case SINHALA => Sinhala(codePoint, intern)
      case MYANMAR => Myanmar(codePoint, intern)
      case ETHIOPIC => Ethiopic(codePoint, intern)
      case CHEROKEE => Cherokee(codePoint, intern)
      case UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS => UnifiedCanadianAboriginalSyllabics(codePoint, intern)
      case OGHAM => Ogham(codePoint, intern)
      case RUNIC => Runic(codePoint, intern)
      case KHMER => Khmer(codePoint, intern)
      case MONGOLIAN => Mongolian(codePoint, intern)
      case BRAILLE_PATTERNS => BraillePatterns(codePoint, intern)
      case CJK_RADICALS_SUPPLEMENT => CjkRadicalsSupplement(codePoint, intern)
      case KANGXI_RADICALS => KangxiRadicals(codePoint, intern)
      case IDEOGRAPHIC_DESCRIPTION_CHARACTERS => IdeographicDescriptionCharacters(codePoint, intern)
      case BOPOMOFO_EXTENDED => BopomofoExtended(codePoint, intern)
      case CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A => CjkUnifiedIdeographsExtensionA(codePoint, intern)
      case YI_SYLLABLES => YiSyllables(codePoint, intern)
      case YI_RADICALS => YiRadicals(codePoint, intern)
      case CYRILLIC_SUPPLEMENTARY => CyrillicSupplementary(codePoint, intern)
      case TAGALOG => Tagalog(codePoint, intern)
      case HANUNOO => Hanunoo(codePoint, intern)
      case BUHID => Buhid(codePoint, intern)
      case TAGBANWA => Tagbanwa(codePoint, intern)
      case LIMBU => Limbu(codePoint, intern)
      case TAI_LE => TaiLe(codePoint, intern)
      case KHMER_SYMBOLS => KhmerSymbols(codePoint, intern)
      case PHONETIC_EXTENSIONS => PhoneticExtensions(codePoint, intern)
      case MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A => MiscellaneousMathematicalSymbolsA(codePoint, intern)
      case SUPPLEMENTAL_ARROWS_A => SupplementalArrowsA(codePoint, intern)
      case SUPPLEMENTAL_ARROWS_B => SupplementalArrowsB(codePoint, intern)
      case MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B => MiscellaneousMathematicalSymbolsB(codePoint, intern)
      case SUPPLEMENTAL_MATHEMATICAL_OPERATORS => SupplementalMathematicalOperators(codePoint, intern)
      case MISCELLANEOUS_SYMBOLS_AND_ARROWS => MiscellaneousSymbolsAndArrows(codePoint, intern)
      case KATAKANA_PHONETIC_EXTENSIONS => KatakanaPhoneticExtensions(codePoint, intern)
      case YIJING_HEXAGRAM_SYMBOLS => YijingHexagramSymbols(codePoint, intern)
      case VARIATION_SELECTORS => VariationSelectors(codePoint, intern)
      case LINEAR_B_SYLLABARY => LinearBSyllabary(codePoint, intern)
      case LINEAR_B_IDEOGRAMS => LinearBIdeograms(codePoint, intern)
      case AEGEAN_NUMBERS => AegeanNumbers(codePoint, intern)
      case OLD_ITALIC => OldItalic(codePoint, intern)
      case GOTHIC => Gothic(codePoint, intern)
      case UGARITIC => Ugaritic(codePoint, intern)
      case DESERET => Deseret(codePoint, intern)
      case SHAVIAN => Shavian(codePoint, intern)
      case OSMANYA => Osmanya(codePoint, intern)
      case CYPRIOT_SYLLABARY => CypriotSyllabary(codePoint, intern)
      case BYZANTINE_MUSICAL_SYMBOLS => ByzantineMusicalSymbols(codePoint, intern)
      case MUSICAL_SYMBOLS => MusicalSymbols(codePoint, intern)
      case TAI_XUAN_JING_SYMBOLS => TaiXuanJingSymbols(codePoint, intern)
      case MATHEMATICAL_ALPHANUMERIC_SYMBOLS => MathematicalAlphanumericSymbols(codePoint, intern)
      case CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B => CjkUnifiedIdeographsExtensionB(codePoint, intern)
      case CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT => CjkCompatibilityIdeographsSupplement(codePoint, intern)
      case TAGS => Tags(codePoint, intern)
      case VARIATION_SELECTORS_SUPPLEMENT => VariationSelectorsSupplement(codePoint, intern)
      case SUPPLEMENTARY_PRIVATE_USE_AREA_A => SupplementaryPrivateUseAreaA(codePoint, intern)
      case SUPPLEMENTARY_PRIVATE_USE_AREA_B => SupplementaryPrivateUseAreaB(codePoint, intern)
      case HIGH_SURROGATES => HighSurrogates(codePoint, intern)
      case HIGH_PRIVATE_USE_SURROGATES => HighPrivateUseSurrogates(codePoint, intern)
      case LOW_SURROGATES => LowSurrogates(codePoint, intern)
      case ARABIC_SUPPLEMENT => ArabicSupplement(codePoint, intern)
      case NKO => Nko(codePoint, intern)
      case SAMARITAN => Samaritan(codePoint, intern)
      case MANDAIC => Mandaic(codePoint, intern)
      case ETHIOPIC_SUPPLEMENT => EthiopicSupplement(codePoint, intern)
      case UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED => UnifiedCanadianAboriginalSyllabicsExtended(codePoint, intern)
      case NEW_TAI_LUE => NewTaiLue(codePoint, intern)
      case BUGINESE => Buginese(codePoint, intern)
      case TAI_THAM => TaiTham(codePoint, intern)
      case BALINESE => Balinese(codePoint, intern)
      case SUNDANESE => Sundanese(codePoint, intern)
      case BATAK => Batak(codePoint, intern)
      case LEPCHA => Lepcha(codePoint, intern)
      case OL_CHIKI => OlChiki(codePoint, intern)
      case VEDIC_EXTENSIONS => VedicExtensions(codePoint, intern)
      case PHONETIC_EXTENSIONS_SUPPLEMENT => PhoneticExtensionsSupplement(codePoint, intern)
      case COMBINING_DIACRITICAL_MARKS_SUPPLEMENT => CombiningDiacriticalMarksSupplement(codePoint, intern)
      case GLAGOLITIC => Glagolitic(codePoint, intern)
      case LATIN_EXTENDED_C => LatinExtendedC(codePoint, intern)
      case COPTIC => Coptic(codePoint, intern)
      case GEORGIAN_SUPPLEMENT => GeorgianSupplement(codePoint, intern)
      case TIFINAGH => Tifinagh(codePoint, intern)
      case ETHIOPIC_EXTENDED => EthiopicExtended(codePoint, intern)
      case CYRILLIC_EXTENDED_A => CyrillicExtendedA(codePoint, intern)
      case SUPPLEMENTAL_PUNCTUATION => SupplementalPunctuation(codePoint, intern)
      case CJK_STROKES => CjkStrokes(codePoint, intern)
      case LISU => Lisu(codePoint, intern)
      case VAI => Vai(codePoint, intern)
      case CYRILLIC_EXTENDED_B => CyrillicExtendedB(codePoint, intern)
      case BAMUM => Bamum(codePoint, intern)
      case MODIFIER_TONE_LETTERS => ModifierToneLetters(codePoint, intern)
      case LATIN_EXTENDED_D => LatinExtendedD(codePoint, intern)
      case SYLOTI_NAGRI => SylotiNagri(codePoint, intern)
      case COMMON_INDIC_NUMBER_FORMS => CommonIndicNumberForms(codePoint, intern)
      case PHAGS_PA => PhagsPa(codePoint, intern)
      case SAURASHTRA => Saurashtra(codePoint, intern)
      case DEVANAGARI_EXTENDED => DevanagariExtended(codePoint, intern)
      case KAYAH_LI => KayahLi(codePoint, intern)
      case REJANG => Rejang(codePoint, intern)
      case HANGUL_JAMO_EXTENDED_A => HangulJamoExtendedA(codePoint, intern)
      case JAVANESE => Javanese(codePoint, intern)
      case CHAM => Cham(codePoint, intern)
      case MYANMAR_EXTENDED_A => MyanmarExtendedA(codePoint, intern)
      case TAI_VIET => TaiViet(codePoint, intern)
      case ETHIOPIC_EXTENDED_A => EthiopicExtendedA(codePoint, intern)
      case MEETEI_MAYEK => MeeteiMayek(codePoint, intern)
      case HANGUL_JAMO_EXTENDED_B => HangulJamoExtendedB(codePoint, intern)
      case VERTICAL_FORMS => VerticalForms(codePoint, intern)
      case ANCIENT_GREEK_NUMBERS => AncientGreekNumbers(codePoint, intern)
      case ANCIENT_SYMBOLS => AncientSymbols(codePoint, intern)
      case PHAISTOS_DISC => PhaistosDisc(codePoint, intern)
      case LYCIAN => Lycian(codePoint, intern)
      case CARIAN => Carian(codePoint, intern)
      case OLD_PERSIAN => OldPersian(codePoint, intern)
      case IMPERIAL_ARAMAIC => ImperialAramaic(codePoint, intern)
      case PHOENICIAN => Phoenician(codePoint, intern)
      case LYDIAN => Lydian(codePoint, intern)
      case KHAROSHTHI => Kharoshthi(codePoint, intern)
      case OLD_SOUTH_ARABIAN => OldSouthArabian(codePoint, intern)
      case AVESTAN => Avestan(codePoint, intern)
      case INSCRIPTIONAL_PARTHIAN => InscriptionalParthian(codePoint, intern)
      case INSCRIPTIONAL_PAHLAVI => InscriptionalPahlavi(codePoint, intern)
      case OLD_TURKIC => OldTurkic(codePoint, intern)
      case RUMI_NUMERAL_SYMBOLS => RumiNumeralSymbols(codePoint, intern)
      case BRAHMI => Brahmi(codePoint, intern)
      case KAITHI => Kaithi(codePoint, intern)
      case CUNEIFORM => Cuneiform(codePoint, intern)
      case CUNEIFORM_NUMBERS_AND_PUNCTUATION => CuneiformNumbersAndPunctuation(codePoint, intern)
      case EGYPTIAN_HIEROGLYPHS => EgyptianHieroglyphs(codePoint, intern)
      case BAMUM_SUPPLEMENT => BamumSupplement(codePoint, intern)
      case KANA_SUPPLEMENT => KanaSupplement(codePoint, intern)
      case ANCIENT_GREEK_MUSICAL_NOTATION => AncientGreekMusicalNotation(codePoint, intern)
      case COUNTING_ROD_NUMERALS => CountingRodNumerals(codePoint, intern)
      case MAHJONG_TILES => MahjongTiles(codePoint, intern)
      case DOMINO_TILES => DominoTiles(codePoint, intern)
      case PLAYING_CARDS => PlayingCards(codePoint, intern)
      case ENCLOSED_ALPHANUMERIC_SUPPLEMENT => EnclosedAlphanumericSupplement(codePoint, intern)
      case ENCLOSED_IDEOGRAPHIC_SUPPLEMENT => EnclosedIdeographicSupplement(codePoint, intern)
      case MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS => MiscellaneousSymbolsAndPictographs(codePoint, intern)
      case EMOTICONS => Emoticons(codePoint, intern)
      case TRANSPORT_AND_MAP_SYMBOLS => TransportAndMapSymbols(codePoint, intern)
      case ALCHEMICAL_SYMBOLS => AlchemicalSymbols(codePoint, intern)
      case CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C => CjkUnifiedIdeographsExtensionC(codePoint, intern)
      case CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D => CjkUnifiedIdeographsExtensionD(codePoint, intern)
      case _ => throw new RuntimeException(s"cannot create unicode block for ${codePoint.toString}")
    }
  }
  case class BasicLatin private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Latin1Supplement private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class LatinExtendedA private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class LatinExtendedB private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class IpaExtensions private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class SpacingModifierLetters private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CombiningDiacriticalMarks private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Greek private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Cyrillic private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Armenian private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Hebrew private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Arabic private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Devanagari private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Bengali private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Gurmukhi private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Gujarati private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Oriya private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Tamil private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Telugu private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Kannada private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Malayalam private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Thai private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Lao private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Tibetan private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Georgian private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class HangulJamo private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class LatinExtendedAdditional private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class GreekExtended private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class GeneralPunctuation private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class SuperscriptsAndSubscripts private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CurrencySymbols private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CombiningMarksForSymbols private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class LetterlikeSymbols private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class NumberForms private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Arrows private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class MathematicalOperators private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class MiscellaneousTechnical private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class ControlPictures private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class OpticalCharacterRecognition private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class EnclosedAlphanumerics private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class BoxDrawing private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class BlockElements private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class GeometricShapes private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class MiscellaneousSymbols private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Dingbats private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CjkSymbolsAndPunctuation private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Hiragana private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Katakana private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Bopomofo private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class HangulCompatibilityJamo private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Kanbun private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class EnclosedCjkLettersAndMonths private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CjkCompatibility private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CjkUnifiedIdeographs private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class HangulSyllables private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class PrivateUseArea private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CjkCompatibilityIdeographs private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class AlphabeticPresentationForms private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class ArabicPresentationFormsA private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CombiningHalfMarks private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CjkCompatibilityForms private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class SmallFormVariants private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class ArabicPresentationFormsB private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class HalfwidthAndFullwidthForms private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Specials private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class SurrogatesArea private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Syriac private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Thaana private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Sinhala private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Myanmar private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Ethiopic private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Cherokee private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class UnifiedCanadianAboriginalSyllabics private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Ogham private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Runic private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Khmer private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Mongolian private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class BraillePatterns private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CjkRadicalsSupplement private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class KangxiRadicals private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class IdeographicDescriptionCharacters private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class BopomofoExtended private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CjkUnifiedIdeographsExtensionA private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class YiSyllables private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class YiRadicals private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CyrillicSupplementary private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Tagalog private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Hanunoo private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Buhid private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Tagbanwa private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Limbu private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class TaiLe private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class KhmerSymbols private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class PhoneticExtensions private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class MiscellaneousMathematicalSymbolsA private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class SupplementalArrowsA private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class SupplementalArrowsB private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class MiscellaneousMathematicalSymbolsB private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class SupplementalMathematicalOperators private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class MiscellaneousSymbolsAndArrows private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class KatakanaPhoneticExtensions private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class YijingHexagramSymbols private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class VariationSelectors private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class LinearBSyllabary private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class LinearBIdeograms private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class AegeanNumbers private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class OldItalic private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Gothic private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Ugaritic private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Deseret private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Shavian private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Osmanya private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CypriotSyllabary private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class ByzantineMusicalSymbols private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class MusicalSymbols private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class TaiXuanJingSymbols private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class MathematicalAlphanumericSymbols private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CjkUnifiedIdeographsExtensionB private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CjkCompatibilityIdeographsSupplement private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Tags private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class VariationSelectorsSupplement private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class SupplementaryPrivateUseAreaA private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class SupplementaryPrivateUseAreaB private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class HighSurrogates private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class HighPrivateUseSurrogates private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class LowSurrogates private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class ArabicSupplement private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Nko private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Samaritan private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Mandaic private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class EthiopicSupplement private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class UnifiedCanadianAboriginalSyllabicsExtended private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class NewTaiLue private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Buginese private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class TaiTham private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Balinese private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Sundanese private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Batak private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Lepcha private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class OlChiki private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class VedicExtensions private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class PhoneticExtensionsSupplement private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CombiningDiacriticalMarksSupplement private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Glagolitic private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class LatinExtendedC private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Coptic private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class GeorgianSupplement private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Tifinagh private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class EthiopicExtended private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CyrillicExtendedA private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class SupplementalPunctuation private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CjkStrokes private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Lisu private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Vai private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CyrillicExtendedB private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Bamum private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class ModifierToneLetters private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class LatinExtendedD private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class SylotiNagri private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CommonIndicNumberForms private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class PhagsPa private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Saurashtra private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class DevanagariExtended private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class KayahLi private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Rejang private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class HangulJamoExtendedA private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Javanese private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Cham private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class MyanmarExtendedA private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class TaiViet private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class EthiopicExtendedA private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class MeeteiMayek private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class HangulJamoExtendedB private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class VerticalForms private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class AncientGreekNumbers private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class AncientSymbols private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class PhaistosDisc private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Lycian private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Carian private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class OldPersian private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class ImperialAramaic private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Phoenician private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Lydian private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Kharoshthi private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class OldSouthArabian private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Avestan private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class InscriptionalParthian private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class InscriptionalPahlavi private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class OldTurkic private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class RumiNumeralSymbols private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Brahmi private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Kaithi private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Cuneiform private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CuneiformNumbersAndPunctuation private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class EgyptianHieroglyphs private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class BamumSupplement private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class KanaSupplement private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class AncientGreekMusicalNotation private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CountingRodNumerals private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class MahjongTiles private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class DominoTiles private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class PlayingCards private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class EnclosedAlphanumericSupplement private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class EnclosedIdeographicSupplement private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class MiscellaneousSymbolsAndPictographs private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class Emoticons private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class TransportAndMapSymbols private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class AlchemicalSymbols private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CjkUnifiedIdeographsExtensionC private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
  case class CjkUnifiedIdeographsExtensionD private[UnicodeBlock] (val codePoint: CodePoint, val intern: Character.UnicodeBlock) extends UnicodeBlock
}

abstract class UnicodeBlock

