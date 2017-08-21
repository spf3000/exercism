object Grains {

  def calcSquare(sq: Int): BigInt = {
    if (sq == 1)  1 else calcSquare(sq -1) * 2
    }

  def square(sq: Int) = {
    if (sq < 1 || sq > 64) None else Some(calcSquare(sq))
  }



}
