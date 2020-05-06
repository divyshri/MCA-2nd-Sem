#!/bin/bash
select filename in *
do
	echo "Entered filename is $REPLY"
	chmod 000 "$filename"
	echo "It is now private"
done
