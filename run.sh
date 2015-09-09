#!/bin/bash

# Absolute path this script is in. /home/user/bin
SCRIPTPATH=`dirname $0`
VER="$2"

if [ -z "${VER}" ]; then VER="1.7.0"; fi

java -cp $SCRIPTPATH/_clojure/clojure-$VER.jar clojure.main $SCRIPTPATH/$1/main.clj
