// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.7")

addSbtPlugin("com.typesafe.sbt" % "sbt-coffeescript" % "1.0.0")

// Use sbt-sublime to generate sublime project with all lib src
addSbtPlugin("com.orrsella" % "sbt-sublime" % "1.0.9")