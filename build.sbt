enablePlugins(ScalaJSPlugin, WorkbenchPlugin)

name := "ScalaJSExample"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.2",
  "com.lihaoyi" %%% "scalatags" % "0.6.7"
)

//scalaJSUseMainModuleInitializer := true