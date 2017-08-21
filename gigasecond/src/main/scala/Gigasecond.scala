import java.time.{LocalDate, LocalDateTime, LocalTime}
import java.time.temporal.ChronoUnit



object Gigasecond {
  def addGigaseconds(startDate: LocalDate): LocalDateTime = {
    val time =  LocalDateTime.of(startDate, LocalTime.MIN)
    time.plus( 1E9.asInstanceOf[Long], ChronoUnit.SECONDS)
  }

  def addGigaseconds(startDateTime: LocalDateTime): LocalDateTime = startDateTime.plus( 1E9.asInstanceOf[Long], ChronoUnit.SECONDS )
}
