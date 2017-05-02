import com.github.retronym.SbtOneJar._

oneJarSettings

name := "Hello"

version := "1.0"

scalaVersion := "2.10.6"

mainClass := Some ("Hello")

libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.25"

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.25"

retrieveManaged := true