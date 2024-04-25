# Getting Started

build command: `mvn clean package`

build docker image (docker engine not needed): `mvn clean compile jib:buildTar`

run command: `java -jar demo-0.0.1-SNAPSHOT.jar`

requires: JAVA 17