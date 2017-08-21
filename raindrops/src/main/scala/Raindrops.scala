object Raindrops {
  def factor(n: Int) = {
     (1 to n).filter(n % _ == 0).foldLeft("")(( msg, factor) => {
       factor match {
         case 3  => msg + "Pling"
         case 5  => msg + "Plang"
         case 7  => msg + "Plong"
         case _  => msg
       }
     })
  }

  def convert(n: Int): String = {
    val x =factor(n)
    if (x.isEmpty) n.toString else x
  }
}

