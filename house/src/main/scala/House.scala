object House {

  val s = List( "that is the horse and the hound and the horn"
    , "that belonged to the farmer sowing his corn"
  , "that kept the rooster that crowed in the morn"
  , "that woke the priest all shaven and shorn"
  , "that married the man all tattered and torn"
  , "that kissed the maiden all forlorn"
  , "that milked the cow with the crumpled horn"
  , "that tossed the dog"
  , "that worried the cat"
  , "that killed the rat"
  , "that ate the malt"
  , "that lay in the house that Jack built.")


  def rhyme = {
    def loop(lines: List[String]): String = {
      if (lines.length<2) "This is the house that Jack built.\n\n"
      else loop(lines.tail) + s"This is the${lines.head.split("^that \\w+\\s*\\w* the").tail.mkString("")}\n${lines.tail.mkString("\n")}\n\n"
    }
    loop(s)
  }
}
