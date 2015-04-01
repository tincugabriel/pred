name := "pred"

organization  := "com.eloquentix"

version       := "0.1"

unmanagedJars in Compile <++= baseDirectory map { base =>
  val baseDirectories = (base / "lib") +++ (base / "lib" / "xstream" ) +++ (base / "plugins") +++
    (base / "wekafiles/packages/LibLINEAR") +++ (base / "wekafiles/packages/LibSVM") +++
    (base / "wekafiles/packages/LibLINEAR/lib") +++ (base / "wekafiles/packages/LibSVM/lib")
  val customJars = baseDirectories ** "*.jar"
  customJars.classpath
}

libraryDependencies += "com.google.code.gson" % "gson" % "2.2.4"

libraryDependencies += "edu.stanford.nlp" % "stanford-parser" % "3.5.1"

libraryDependencies += "org.apache.commons" % "commons-math3" % "3.3"

// works in intellij , not in command line??

libraryDependencies += "jdom" % "jdom" % "1.1"

libraryDependencies += "joda-time" % "joda-time" % "1.6"

libraryDependencies += "com.thoughtworks.xstream" % "xstream" % "1.4.4"

libraryDependencies += "com.thoughtworks.xstream" % "xstream-benchmark" % "1.4.4"
