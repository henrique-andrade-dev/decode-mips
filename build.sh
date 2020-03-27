#!/bin/bash

cd src
javac *.java
jar cvfm ../decode-mips.jar Manifest.mf *.class
rm *.class