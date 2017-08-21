import scala.annotation.tailrec

object BinarySearch {
  def search[T](a:Array[T],n:T)(implicit ord: T => Ordered[T]):Option[Int]= {

    @tailrec
    def searchAux(start:Int,end:Int):Option[Int]={
      if (end <= start)
        return None
      val center:Int =  (end + start) / 2
      val centerValue = a(center)
      if(centerValue == n)
        Some(center)
      else if(centerValue > n)
        searchAux(start,center)
      else
        searchAux(center+1,end)
    }

    searchAux(0,a.length)
  }
}
