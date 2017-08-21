class Phrase(s: String) {

  def isAllowed(char: Char) =  char.isLetterOrDigit || char == '\''

  def wordCount = {
    s.map(_.toLower)
      .split("[ ,]")
      .map(list => list.filter(x => isAllowed(x) ))
        .filterNot(_.isEmpty)
      .groupBy(identity)
      .values
        .map(l => (l(0), l.length))
        .toMap
  }

}
