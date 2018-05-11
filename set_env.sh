#!/bin/bash

# Command line to execute the test
# Expects below ennvironment variables
# BROWSER = chrome / firefox
export BROWSER=chrome
echo $BROWSER
# MODULE  = order-module / search-module
export MODULE=search-module
echo $MODULE
# GRIDHOST = selenium hub hostname / ipaddress
# SELENIUM_HUB = selenium hub hostname / ipaddress
#export SELENIUM_HUB=$(docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' selenium-hub)
export SELENIUM_HUB=192.168.1.112
echo $SELENIUM_HUB
