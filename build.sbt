scalaVersion := "2.13.14"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % Test

ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.1"

lazy val root = (project in file("."))
  .settings(
    name := "FizzBuzz"
  )
