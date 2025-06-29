#!/bin/bash

# Genera classpath in cp.txt
java -jar ./evosuite-1.2.0.jar \
  -Dsandbox=false \
  -class "org.apache.openjpa.$1" \
  -projectCP "target/classes:$(mvn dependency:build-classpath -DincludeScope=test -Dmdep.outputFile=/dev/stdout -q \
                               | tr ':' '\n' \
                               | grep -v 'mockito-core' \
                               | paste -sd: -)"
