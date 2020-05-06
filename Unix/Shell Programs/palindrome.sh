#!/bin/bash
read -p "Enter any number to check palindrome" num
temp=$num
sumpp=0
while [ $num -ne 0 ]
do
t=$(( $num%10))
let sumpp=$(( $(( $sumpp*10 )) +t ))
let num/=10
done
if (( $temp == $sumpp ))
then
	echo "Palindrome"
else
	echo "Not a Palindriome"
fi

