object Isogram {

  def isIsogram(s: String) = {
    val charList = s.toLowerCase.toList.filter(_.isLetter)
    charList.size == charList.toSet.size

  }

}