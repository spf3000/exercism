object BeerSong {

  def verses(start: Int, end: Int) = {
    require(start >= end)
    val msg = (end to start).reverse.map(verse).mkString("\n")
    println(msg)
    msg
  }

  def verse(num: Int) = {
    num match {
      case 2 => s"$num bottles of beer on the wall, $num bottles of beer.\nTake one down and pass it around, ${num-1} bottle of beer on the wall.\n"
      case 1 => "1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n"
      case 0 => "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"
      case _ => s"$num bottles of beer on the wall, $num bottles of beer.\nTake one down and pass it around, ${num-1} bottles of beer on the wall.\n"
    }

  }

}
