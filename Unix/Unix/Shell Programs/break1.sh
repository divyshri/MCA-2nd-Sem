#!/bin/bash
counter=0
while [ $counter -le 20 ]
do 
	if (( $counter == 10 )) 
  then
		echo "break occured"
		break
	fi
	echo "counter is Less Than 10 =  $counter"
	let counter=$counter+1
done

