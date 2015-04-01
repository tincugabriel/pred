#!/bin/bash

MAXHEAP="4g"

if [[ -z "$1" ]]; then
    echo 'no DISPLAY variable set. Using DISPLAY=:0.0...' 
    export DISPLAY=:0.0
fi
OTHER_CLASS="edu.cmu.side.recipe.PredictionServer"

CLASSPATH="bin:lib/*:lib/xstream/*:wekafiles/packages/chiSquaredAttributeEval/chiSquaredAttributeEval.jar:wekafiles/packages/bayesianLogisticRegression/bayesianLogisticRegression.jar:wekafiles/packages/LibLINEAR/lib/liblinear-1.8.jar:wekafiles/packages/LibLINEAR/LibLINEAR.jar:wekafiles/packages/LibSVM/lib/libsvm.jar:wekafiles/packages/LibSVM/LibSVM.jar:plugins/genesis.jar"
java $OS_ARGS -Xmx$MAXHEAP -classpath $CLASSPATH $OTHER_CLASS $@

