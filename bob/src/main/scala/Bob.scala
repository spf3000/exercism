

object Bob {
  implicit class Regex(sc: StringContext) {
    def r = new util.matching.Regex(sc.parts.mkString, sc.parts.tail.map(_ => "x"): _*)
  }

  def response(s: String): String = {
    def isEmpty(m: String) = m.trim.isEmpty
    def isQuestion(message: String) = message.trim.endsWith("?")
    def isShout(message: String) = {
      def allUppercase = message == message.toUpperCase()
      def containsLetters = message.exists(_.isLetter)

      allUppercase && containsLetters
    }

    s match {
      case s if isEmpty(s)   => "Fine. Be that way!"
      case s if isShout(s) => "Whoa, chill out!"
      case s if isQuestion(s)   => "Sure."
      case _ => "Whatever."
    }
  }


}
