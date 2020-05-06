#!/bin/bash
testfile()
{
	for panda
	do
	if [[ -f "$panda" && -r "$panda" ]] 
	then
		echo "File is Readable"
	else
		echo "File is not readable"
	fi
	done
}

testfile t1.txt loop1.sh loop2.sh
