#!/bin/bash

funky () {
	Just_a_second=2
	i=0
	timer=10
	while [ $i -lt $timer ]
	do
		echo "Functions are majjedar"
		sleep $Just_a_second
		let i+=1
	done	
}
funky
