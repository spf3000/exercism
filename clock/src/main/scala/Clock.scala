 class Clock(val hour:Int, val minute: Int) {

  override def toString: String = s"${"%02d".format(hour)}:${"%02d".format(minute)}"

  override def equals(obj: scala.Any): Boolean = obj match {
    case c: Clock => c.hour == this.hour && c.minute == this.minute
    case _ => false
  }

   def + (that: Clock): Clock = Clock(this.hour + that.hour,  this.minute + that.minute)

   def - (that: Clock): Clock = Clock(this.hour - that.hour,  this.minute - that.minute)
}


object Clock {
  def apply(h: Int, m: Int) = {
    val totalMinutes = h * 60 + m
    val dayMinutes = 24 * 60
    val todayMinute = totalMinutes % dayMinutes

    if (todayMinute >= 0) {
      val hours = todayMinute / 60
      val minutes = todayMinute % 60
      if (minutes == 60) new Clock(hours + 1, 0) else new Clock(hours, minutes)
    }
    else {
      val hours = 23 + (todayMinute / 60 )
      val minutes = 60 + (todayMinute % 60)
      if (minutes == 60) new Clock(hours + 1, 0) else new Clock(hours, minutes)
    }
  }

  def apply(minute: Int): Clock = Clock(0,minute)
}