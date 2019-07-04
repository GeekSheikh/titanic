name := "TitanicLab"

organization := "com.databricks.labs"

version := "0.1"

scalaVersion := "2.11.12"
scalacOptions ++= Seq("-Xmax-classfile-name","78")

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.0"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.4.0"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.0"
libraryDependencies += "org.mlflow" % "mlflow-client" % "0.9.1"
libraryDependencies += "org.json4s" %% "json4s-jackson" % "3.5.3"
libraryDependencies += "ml.dmlc" % "xgboost4j" % "0.90"
libraryDependencies += "ml.dmlc" % "xgboost4j-spark" % "0.90"
libraryDependencies += "junit" % "junit" % "4.8.1" % "test"
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.6" % "test"