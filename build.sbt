ThisBuild / scalaVersion := "2.13.15" 

lazy val akkaVersion = "2.10.14"

resolvers in ThisBuild += "akka-secure-mvn" at "https://repo.akka.io/maven/codemash"
resolvers in ThisBuild += Resolver.url("akka-secure-ivy", url("https://repo.akka.io/maven/codemash"))(Resolver.ivyStylePatterns)

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
    )
  )
