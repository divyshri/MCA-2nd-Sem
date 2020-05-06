#!/bin/bash
echo "Enter number"
read num


if (( $(( $num % 2 )) == 0 ));
then
	echo "Even number"
else
	echo "Odd number"
fi
