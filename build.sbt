name := "spark-sbt"

version := "1.0"

scalaVersion := "2.11.8"


libraryDependencies ++={
  Seq(
    lib("spark-core"),
    lib("spark-sql"),
    lib("spark-mllib"),
    lib("spark-graphx"),
    lib("spark-streaming"),
    lib("spark-streaming-flume"),
    "org.apache.spark" %% "spark-streaming-kafka" % "1.6.2" % "provided",
    "com.github.scopt" %% "scopt" % "3.5.0"
  )
}

def lib(module:String) = "org.apache.spark" %% module % "2.0.1" % "provided"

initialCommands in console := """
import org.apache.spark.sql.functions._
val spark = org.apache.spark.sql.SparkSession
  .builder()
  .master("local[*]")
  .appName("shell")
  .getOrCreate()
import spark.implicits._"""

scalacOptions := Seq("-unchecked", "-deprecation")