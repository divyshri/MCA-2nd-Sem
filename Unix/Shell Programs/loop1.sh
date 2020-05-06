#!/bin/bash
counter=0
while [ $counter -le 10 ]
do 
	echo "Value of counter is $counter"
	let counter=$counter+1
done

