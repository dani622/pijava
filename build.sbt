name := """pijava"""

version := "1.0"

scalaVersion := "2.11.8"

mainClass in (Compile, run) := Some("gov.pnnl.pijava.PiJava")

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

