object DifferenceOfSquares {

  def sumOfSquares(n: Int): Int = {

    val ans = (1 to n).map(_^2).sum
    println(s"sumOfSquares $ans")
    ans
  }

  def squareOfSum(n: Int): Int = {

    val ans = (1 to n).sum ^2
    println(s"squareOfSum $ans")
    ans
  }

  def differenceOfSquares(n: Int): Int = {
    val sqOs = squareOfSum(n)
    val soSq = sumOfSquares(n)
    squareOfSum(n) - sumOfSquares(n)
  }
}

