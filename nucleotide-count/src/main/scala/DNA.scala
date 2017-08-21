
class DNA(dna: String) {

  val allowedChars = List('A','T','C','G')


  def count(char: Char): Either[String, Int] = {
    nucleotideCounts match {
      case Left(s: String) => Left(s)
      case Right(m: Map[Char, Int]) => m.get(char) match {
        case Some(x) => Right(x)
        case None => Left(s"invalid nucleotide '$char'" )
      }
    }
  }

  def nucleotideCounts: Either[String, Map[Char, Int]] = {
    val grouped =  dna.groupBy(identity).values
      .map(l => (l(0), l.length))
      .toMap
    val count = allowedChars.map(c => (c,  if(grouped.keySet.contains(c)) grouped(c) else 0)).toMap
    val invalidList = grouped.filterNot(p => allowedChars.contains(p._1))
    if (invalidList.isEmpty) Right(count) else Left(s"invalid nucleotide '${invalidList.head._1}'")

  }

}
