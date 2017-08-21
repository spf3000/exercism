case class Matrix( spec: String) {

    val rows = spec.split("\n").map(_.split(" ").toVector.map(_.toInt))

    def cols(num: Int) =  rows.map(_(num))





}
