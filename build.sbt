lazy val commonSettings = Seq(
  organization := "ua.tarys",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.12.6"
)

lazy val root = (project in file("."))
  .settings(
    commonSettings,
    name := "scala-for-impatient"
  )