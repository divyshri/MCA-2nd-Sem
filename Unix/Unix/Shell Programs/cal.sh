#!/bin/bash
a=10.5
b=10
echo "Floating point calculator"
echo
echo "add sub mul div as for $a and $b"
echo "$a+$b" | bc
echo "$a-$b" | bc
echo "$a*$b" | bc
z=`echo "scale=8;$a/$b" | bc`
echo $z

