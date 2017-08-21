import scala.util.Try

object RnaTranscription {

  val coding:Map[Char,Char] = Map('G'->'C', 'C' -> 'G','T' -> 'A', 'A'->'U')
  def toRna(s:String):Option[String] = Try(s.map(coding)).toOption

}

