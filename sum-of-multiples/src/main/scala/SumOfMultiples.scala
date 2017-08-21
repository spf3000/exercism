object SumOfMultiples {
  def sumOfMultiples(factors: Set[Int], limit: Int): Int = {
    (0 until limit).filter(i =>  factors.exists(f => i % f == 0)).sum
  }
}

