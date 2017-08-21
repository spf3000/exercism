class Robot () {

  var name = reset

  def reset: String = {
    val r = scala.util.Random
    def getChar = (r.nextInt(26) + 'A').asInstanceOf[Char]
    val nums =  r.nextInt(900) + 100
    val x = s"$getChar$getChar${nums.toString}"
    name = x
    x
  }
}

