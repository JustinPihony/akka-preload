ThisBuild / scalaVersion := "2.13.15" 

lazy val akkaVersion = "2.10.0"

lazy val root = (project in file("."))
  .settings(
    name := "Akka Load To Cache",
    version := "1.0.0",

    // Add the needed Akka dependencies
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor"                 % akkaVersion,
      "com.typesafe.akka" %% "akka-actor-typed"           % akkaVersion,
      "com.typesafe.akka" %% "akka-stream"                % akkaVersion,
      "com.typesafe.akka" %% "akka-stream-typed"          % akkaVersion,
      "com.typesafe.akka" %% "akka-cluster"               % akkaVersion,
      "com.typesafe.akka" %% "akka-cluster-typed"         % akkaVersion,

      //Test dependencies
      "com.typesafe.akka" %% "akka-testkit"               % akkaVersion % Test,
      "com.typesafe.akka" %% "akka-actor-testkit-typed"   % akkaVersion % Test
    ),

    resolvers += "Akka Maven" at "https://repo.akka.io/maven"
  )
