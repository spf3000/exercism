import java.time.LocalDate
import Meetup.WeekDay
import scala.util.{Failure, Success, Try}

case class Meetup(month: Int, year: Int) {

  def findFirstDay(range: Range, weekDay: WeekDay) = {
    val day = range.filter(d => LocalDate.of(year, month, d).getDayOfWeek.getValue == weekDay.id + 1).head
    LocalDate.of(year, month, day)
  }
  def findLastDay(range: Range, weekDay: WeekDay) = {
    val day = range
      .map(d => Try(LocalDate.of(year, month, d)))
          .filter( _ match {
            case Success(dte) =>  dte.getDayOfWeek.getValue == weekDay.id + 1
            case Failure(_) => false
          }
          )
    day.last.get
  }

val teenth = (weekday: WeekDay) =>  findFirstDay(13 to 19,  weekday: WeekDay)
val first = (weekday: WeekDay) =>  findFirstDay(1 to 7,  weekday: WeekDay)
val second = (weekday: WeekDay) =>  findFirstDay(8 to 14,  weekday: WeekDay)
val third = (weekday: WeekDay) =>  findFirstDay(15 to 21,  weekday: WeekDay)
val fourth = (weekday: WeekDay) =>  findFirstDay(22 to 28,  weekday: WeekDay)
val last = (weekday: WeekDay) =>  findLastDay(22 to 31,  weekday: WeekDay)

}
  object Meetup extends Enumeration {
    type WeekDay = Value
    val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value
}


