import java.text.DecimalFormat

case class SpaceAge(val seconds: Long) {
  val earthSecs: Double = 31557600
  val mercuryEarthRatio = 0.2408467
  val venusEarthRatio = 0.61519726
  val marsEarthRatio = 1.8808158
  val jupiterEarthRatio = 11.862615
  val saturnEarthRatio = 29.447498
  val uranusEarthRatio = 84.016846
  val neptuneEarthRatio = 164.79132



  val onEarth: Double = seconds / earthSecs
  val onMercury: Double = seconds / (earthSecs * mercuryEarthRatio)
  val onVenus: Double = seconds / (earthSecs * venusEarthRatio)
  val onMars: Double = seconds / (earthSecs * marsEarthRatio)
  val onJupiter: Double = seconds / (earthSecs * jupiterEarthRatio)
  val onSaturn: Double = seconds / (earthSecs * saturnEarthRatio)
  val onUranus: Double = seconds / (earthSecs * uranusEarthRatio)
  val onNeptune: Double = seconds / (earthSecs * neptuneEarthRatio)
}







