
  case class Triangle(s1: Double, s2: Double, s3: Double) {
    require(s1 > 0 && s2 > 0 && s3 > 0)

    def isTriangle = {
      val desc = List(s1, s2, s3).sortWith(_>_)
      Math.pow(desc.head, 2) < Math.pow(desc.tail.head, 2) + Math.pow(desc(2), 2)
    }

    //def isTriangle =

    def equilateral = {
      isTriangle && s1.equals(s2) && s1.equals(s3)
    }

    def scalene = {
      isTriangle && !s1.equals(s2) && !s1.equals(s3) && ! s2.equals(s3)
    }

    def isosceles = {
      isTriangle && !scalene && s1.equals(s2) || s2.equals(s3) || s1.equals(s3)
    }

  }


