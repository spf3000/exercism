object Anagram {

  def anagrams(word: String, cand: List[String]) = {
    val sortedWord = word.toLowerCase().sorted
    cand.filterNot(_.toLowerCase == word.toLowerCase  )
        .filter(x => x.toLowerCase().sorted == sortedWord)
  }

}
