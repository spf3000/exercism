object Etl {
  def transform(legacyScheme: Map[Int, Seq[String]])= {
    val newSeq = for {
      score <- legacyScheme.keys
      character <- legacyScheme(score)
    } yield (character.toLowerCase, score )

  newSeq.toIndexedSeq.sorted.toMap

  }

}
