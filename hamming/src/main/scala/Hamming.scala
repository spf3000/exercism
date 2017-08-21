object Hamming {
  def distance(stringA: String, stringB: String): Option[Int] = {
    if (stringA.length != stringB.length) {
      None
    } else {
      Some(
        stringA.zip(stringB).count(pair => pair._1 != pair._2)
      )
    }
  }
}