import scala.language.postfixOps

lazy val javaVersion = "14"

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.1"

ThisBuild / javacOptions ++= Seq("-source", javaVersion, "-target", javaVersion)

lazy val root = (project in file("."))
  .settings(
    licenses += ("MIT", url("https://opensource.org/licenses/MIT")),
    organization     := "com.sageserpent",
    organizationName := "sageserpent",
    description      := "A very minimal genetic algorithm framework for Scala.",
    scalacOptions ++= List("-source:future"),
    name := "actinium",
    libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4",
    libraryDependencies += "org.typelevel" %% "cats-core"    % "2.9.0",
    libraryDependencies += "org.slf4j"      % "slf4j-simple" % "2.0.10" % Test,
    libraryDependencies += "com.sageserpent" %% "americium" % "1.18.3" % Test,
    libraryDependencies += "com.lihaoyi"     %% "pprint"    % "0.8.1"  % Test,
    libraryDependencies += "com.eed3si9n.expecty" %% "expecty" % "0.16.0" % Test,
    libraryDependencies += "net.aichler" % "jupiter-interface" % JupiterKeys.jupiterVersion.value % Test,
    Test / fork               := true,
    Test / testForkedParallel := true,
    Test / javaOptions ++= Seq("-Xms10G", "-Xmx10G")
  )
