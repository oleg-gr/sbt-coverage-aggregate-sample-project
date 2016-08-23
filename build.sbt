import scoverage.ScoverageKeys._

name := "sbt-coverage-aggregate-sample-project"

version := "1.0"

scalaVersion := "2.11.8"

val junitInt = "com.novocode" % "junit-interface" % "0.11" % "test"

lazy val projectA = (project in file("projectA"))
  .settings(
    coverageEnabled := true,
    libraryDependencies ++= Seq(
      junitInt
    )
  )
lazy val projectB = (project in file("projectB"))
  .settings(
    coverageEnabled := true,
    libraryDependencies ++= Seq(
      junitInt
    )
  )
  .dependsOn(projectA)
