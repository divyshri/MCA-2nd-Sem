#!/bin/bash
echo "Enter a file name"
read filename
if [  -s "$filename" ]
then
	echo "File is Directory"
else
	echo "File is not a Directory"
fi
