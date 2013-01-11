name			:= "sccompat"

organization	:= "de.djini"

version			:= "0.3.0"

scalaVersion	:= "2.9.2"

scalacOptions	++= Seq("-deprecation", "-unchecked")

javacOptions	++= Seq("-source", "1.6", "-target", "1.6")	
