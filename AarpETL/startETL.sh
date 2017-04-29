#!/bin/bash


JAVA_HOME="/usr/lib/jvm/jdk1.7.0_75"
JAVA="$JAVA_HOME/bin/java"
PATH="$JAVA_HOME/bin/:$PATH"


MYCLASS="com.proximo.aarp.AarpETL"
APPDIR="/home/proximo/etl/"
LIBDIR="/home/proximo/etl/lib"
RESOURCES="/home/proximo/etl/resources"

SIPATH="$LIBDIR/*"
for JAR in `ls $LIBDIR`; do
    echo $JAR
    SIPATH="$SIPATH:$LIBDIR/$JAR"
done;

CLASSPATH="${APPDIR}:${SIPATH}:${RESOURCES}"
echo $CLASSPATH
java -cp $CLASSPATH ${MYCLASS}
