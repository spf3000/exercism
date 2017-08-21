

object NumberType extends Enumeration {
  type NumberType = Value
  val Deficient, Perfect, Abundant = Value
}

object PerfectNumbers {

  def factors(num: Int) = {
    (1 until num) filter(num % _ == 0)
  }

  def classify(num: Int): Either[String, NumberType.Value] = {
    num match {
      case x if x < 1 => Left("Classification is only possible for natural numbers.")
      case _ => factors(num).sum match {
        case i if i < num => Right(NumberType.Deficient)
        case i if i == num => Right(NumberType.Perfect)
        case i if i > num => Right(NumberType.Abundant)
      }
    }

  }

}
