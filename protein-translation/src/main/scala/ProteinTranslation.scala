object ProteinTranslation {
  val codeMap = Map(
    "AUG" -> "Methionine",
    "UUU" -> "Phenylalanine",
    "UUC" -> "Phenylalanine",
    "UUA" -> "Leucine",
    "UUG" -> "Leucine",
    "UCU" -> "Serine",
    "UCC" -> "Serine",
    "UCA" -> "Serine",
    "UCG" -> "Serine",
    "UAU" -> "Tyrosine",
    "UAC" -> "Tyrosine",
    "UGU" -> "Cysteine",
    "UGC" -> "Cysteine",
    "UGG" -> "Tryptophan",
    "UAG" -> "STOP",
    "UGA" -> "STOP",
    "UAA" -> "STOP"

  )


  def translate(code: String) = code.grouped(3).toSeq.map(codeMap(_)).takeWhile(_ != "STOP")


}