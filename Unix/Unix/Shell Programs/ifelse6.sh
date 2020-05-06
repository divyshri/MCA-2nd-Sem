#!/bin/bash

if [[  -r "$1" &&  -w "$1" &&  -x "$1" ]]
then
echo "True Find"
else
echo "False Find"
fi
