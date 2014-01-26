name := "hoge"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "org.specs2" %% "specs2" % "2.3.4" % "test",
  "mysql" % "mysql-connector-java" % "5.1.25" ,
  "org.scalikejdbc"      %% "scalikejdbc-play-plugin" % "1.7.3",
  "org.skinny-framework" %% "skinny-orm"              % "0.9.25"
)     

play.Project.playScalaSettings
