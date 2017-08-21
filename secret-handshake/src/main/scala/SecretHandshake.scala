object SecretHandshake {

val codes = List( "wink" , "double blink", "close your eyes", "jump")
  private val One = '1'


  def commands(inputNumber: Int) = {
    val bin = inputNumber.toBinaryString.reverse
    val cmds = codes.zipWithIndex

      val list = cmds.filter(c => c._2 < bin.length && bin.charAt(c._2) == One).map(_._1)
    if(bin.length >= 5 && bin.charAt(4) == One) list.reverse else list

  }

}
