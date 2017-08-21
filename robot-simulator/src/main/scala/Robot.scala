import Bearing.Bearing

object Bearing extends Enumeration {
  type Bearing = Value
  val North, South, East, West = Value
  val list = List(North, East, South, West)
  def bearLeft(bearing: Bearing) = {
    val idxOf = list.indexOf(bearing)
    if (idxOf == 0) list.last else list(idxOf -1)
  }
  def bearRight(bearing: Bearing) = {
    val idxOf = list.indexOf(bearing)
    if (idxOf == list.length - 1) list.head else list(idxOf + 1)
  }
}

case class Robot(bearing: Bearing, coordinates: (Int, Int)) {
  def turnLeft: Robot = Robot(Bearing.bearLeft(bearing), coordinates)
  def turnRight: Robot = Robot(Bearing.bearRight(bearing), coordinates)

  def advance: Robot = {
    bearing match {
      case Bearing.North => Robot(bearing, (coordinates._1, coordinates._2 + 1))
      case Bearing.South => Robot(bearing, (coordinates._1, coordinates._2 - 1))
      case Bearing.East =>  Robot(bearing, (coordinates._1 + 1, coordinates._2 ))
      case Bearing.West =>  Robot(bearing, (coordinates._1 - 1, coordinates._2 ))
    }
  }

  def simulate(cmds: String): Robot = {
      if(cmds.isEmpty) this else {
        val r = cmds.head match {
          case 'L' => turnLeft
          case 'R' => turnRight
          case 'A' => advance
        }
        r.simulate(cmds.tail)
      }
  }


}



