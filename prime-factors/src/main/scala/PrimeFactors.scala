object PrimeFactors {

  def factors(n: Long) = {
    def loop(i: Long, pf: Long,  acc: List[Long]): List[Long] = {
      if (i == 1) acc
      else {
        val div = i / pf
        if (i % pf == 0) loop(div, pf, acc :+ pf)
        else loop(i, pf + 1, acc)
      }
    }
  loop(n, 2, List.empty)
  }

}
