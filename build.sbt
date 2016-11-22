scalaVersion := "2.12.1"
resolvers += Resolver.sonatypeRepo("snapshots")
libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.13.4" % Test,
  "com.github.alexarchambault" %% "scalacheck-shapeless_1.13" % "1.1.5-SNAPSHOT" % Test
)
testOptions in Test += Tests.Argument(TestFrameworks.ScalaCheck, "-maxSize", "4")
