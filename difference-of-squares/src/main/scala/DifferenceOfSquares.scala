object DifferenceOfSquares {

  def sumOfSquares(n: Int): Int = {
     (1 to n).map(math.pow(_,2)).sum.asInstanceOf[Int]
  }

  def squareOfSum(n: Int): Int = {
    math.pow((1 to n).sum, 2).asInstanceOf[Int]
  }

  def differenceOfSquares(n: Int): Int = {
    val sqOs = squareOfSum(n)
    val soSq = sumOfSquares(n)
    sqOs - soSq
  }
}
