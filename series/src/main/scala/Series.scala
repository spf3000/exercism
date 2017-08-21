object Series {

  def slices(segment: Int, series: String) = series.map(_.asDigit).sliding(segment).toList

}
