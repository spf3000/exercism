scalaVersion := "2.12.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

libraryDependencies += "com.github.to-ithaca" %% "libra" % "0.2.0"
libraryDependencies += "org.typelevel"  %% "squants"  % "1.2.0"
libraryDependencies += "org.typelevel" % "scala-library" % "2.12.1"
libraryDependencies ++= Seq(
  "eu.timepit" %% "singleton-ops" % "0.0.4"
)


scalaOrganization := "org.typelevel"
scalacOptions += "-Yliteral-types"