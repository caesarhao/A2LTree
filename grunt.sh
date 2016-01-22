#!/usr/bin/bash
rm -rf build/*
java -jar lib/antlr-4.*-complete.jar A2L.g4 -o build
javac -classpath lib/antlr-4.*-complete.jar build/*.java
cd build
java org.antlr.v4.runtime.misc.TestRig A2L a2l -gui < ../test/*.a2l

