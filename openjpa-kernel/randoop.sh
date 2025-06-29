#!/bin/bash

java -ea -cp ./randoop-all-4.3.4.jar:target/classes:$(mvn dependency:build-classpath -Dmdep.outputFile=/dev/stdout -q) \
  randoop.main.Main gentests \
  --testclass=org.apache.openjpa.$1.$2 \
  --junit-output-dir=src/test/java/org/apache/openjpa/$1

