name := "effectful"

description := "A syntax for type-safe effectful computations in Scala"

version := "1.2-SNAPSHOT"

organization := "org.pelotom"

startYear := Some(2013)

scalaVersion := "2.12.1"

libraryDependencies ++= ((scalaVersion) { sv => Seq("org.scala-lang" % "scala-reflect" % sv) }).value

// libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.1.2"
libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.27"

// libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.12.2" % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.0"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature", "-Xlint", "-Xfatal-warnings")

scalacOptions ++= Seq("-language:higherKinds", "-language:postfixOps")

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>https://github.com/pelotom/effectful</url>
  <licenses>
    <license>
      <name>MIT</name>
      <url>http://opensource.org/licenses/MIT</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:pelotom/effectful.git</url>
    <connection>scm:git:git@github.com:pelotom/effectful.git</connection>
  </scm>
  <developers>
    <developer>
      <id>pelotom</id>
      <name>Tom Crockett</name>
      <url>https://github.com/pelotom</url>
    </developer>
  </developers>
)