object PhoneNumber {

  def clean(number: String) = {
    val trimmed = number.filter(_.isDigit)
    val minusOne = if (trimmed.head == '1') trimmed.tail else trimmed
    val twoToNine = ('2' to '9').toSet
    if (minusOne.length == 10 && twoToNine.contains(minusOne.head )) Some(minusOne) else None
    }

}
