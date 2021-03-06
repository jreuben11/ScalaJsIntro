enablePlugins(ScalaJSPlugin) //TODO: Expression type (DslEntry) must confirm to Setting[_] - Settings -> Build, Execution, Deployment -> Build Tools -> SBT

name := "Scala.js Tutorial"

scalaVersion := "2.11.7"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.8.1"
libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.8.0"

jsDependencies += RuntimeDOM

skip in packageJSDependencies := false  //-jsdeps.js

// uTest settings
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.0" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")

persistLauncher in Compile := true
persistLauncher in Test := false

ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }