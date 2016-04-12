name := "todo-demo"

scalaVersion := "2.11.7"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

version := "1.0-SNAPSHOT"

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  "com.novus" %% "salat" % "1.9.9",
  specs2 % Test,
  "org.reactivemongo" %% "play2-reactivemongo" % "0.11.7.play24"
)

routesGenerator := InjectedRoutesGenerator

