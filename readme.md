# Spark sbt project

An sbt project setup to
1. build the examples from the Spark distro from sbt
2. run the Spark REPL from sbt with continuous rebuild
3. submit tasks from sbt

###Ad 3 build Spark examples
The sbt dependencyLibs are those required by the distro examples

###Ad 2 Spark REPL
The `initialCommands in console` setting in `build.sbt` defines the imports and vals available when you run `~console`

###Ad 3 submit tasks
The sbt plugin `sbt-spark-submit` allows for submit spark tasks from sbt


