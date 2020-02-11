val dottyVersion = "0.22.0-RC1"

lazy val intersection_types = project.in(file("intersection-types"))
  .settings(
      name := "intersection-types",
      scalaVersion := dottyVersion,
      libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test
  )

lazy val opaque_types = project.in(file("opaque-types"))
  .settings(
      name := "opaque-types",
      scalaVersion := dottyVersion,
      libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test
  )

lazy val root = project
  .in(file("."))
  .aggregate(intersection_types, opaque_types)
  .settings(
    name := "dotty-simple",
    version := "0.1.0",
    scalaVersion := dottyVersion,
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test
)
