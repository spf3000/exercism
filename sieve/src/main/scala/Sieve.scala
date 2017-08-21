object Sieve {


  def primes(n: Int) = {
    def loop(primes: List[Int] , candidates: List[Int]): List[Int] = {
      if (candidates.isEmpty) primes else loop(primes :+ candidates.head, candidates.filterNot(_ % candidates.head == 0))
    }
  loop(List.empty, (2 to n).toList)

  }
}
