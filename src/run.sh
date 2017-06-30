#!/bin/sh

java -jar ../out/artifacts/JMXTutorialV1_jar/JMXTutorialV1.jar \
     -Dcom.sun.management.jmxremote \
     -Dcom.sun.management.jmxremote.port=1616 \
     -Dcom.sun.management.jmxremote.authenticate=false \
     -Dcom.sun.management.jmxremote.ssl=false \
