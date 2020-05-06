#!/bin/bash
read -p 'Enter value' val
if (( $(( $(( $val % 400 )) == 0 )) || $(( $(( $(( $val % 100 )) != 0)) && $(( $(( $val % 4 )) == 0 )) )) ))
then
echo "Leap Year"
else
echo "Not a leap Year"
fi
