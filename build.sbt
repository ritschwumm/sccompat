name			:= "sccompat"

organization	:= "de.djini"

version			:= "0.0.1"

scalaVersion	:= "2.9.2"

//publishArtifact in (Compile, packageBin)	:= false

publishArtifact in (Compile, packageDoc)	:= false

publishArtifact in (Compile, packageSrc)	:= false

scalacOptions	++= Seq("-deprecation", "-unchecked")

javacOptions	++= Seq("-source", "1.6", "-target", "1.6")	