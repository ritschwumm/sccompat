name			:= "sccompat"

organization	:= "de.djini"

version			:= "0.4.0"

scalaVersion	:= "2.10.0"

scalacOptions	++= Seq(
	"-deprecation",
	"-unchecked",
	// "-language:implicitConversions",
	// "-language:existentials",
	// "-language:higherKinds",
	// "-language:reflectiveCalls",
	// "-language:dynamics",
	// "-language:postfixOps",
	// "-language:experimental.macros"
	"-feature"
)

javacOptions	++= Seq("-source", "1.6", "-target", "1.6")	
