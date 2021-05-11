val scala3Version = "3.0.0-RC3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-simple",
    version := "0.1.0",
    scalaVersion := scala3Version,
    libraryDependencies += compilerPlugin(
      "com.kubukoz" % "better-tostring" % "0.3.0" cross CrossVersion.full
    )
  )
