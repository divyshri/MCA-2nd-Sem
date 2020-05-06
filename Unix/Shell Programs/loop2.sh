#!/bin/bash
choice="Y"
while [ $choice == "Y" ] 
do

read -p "Enter two number" num1 num2 
echo "1. Addition"
echo "2. Subtraction"
echo "3. Multiply"
echo "4. Divide"
read -p "Enter your choice" choice
case $choice in

1) read -p "Enter two number" n1 n2
	let c=$n1+$n2
   echo "Addition is $c "
	;;
2) echo "Subtraction is $(( $num1 - $num2 ))"
	;;
3) echo "Multiplication is $(( $num1 * $num2 ))"
	;;
4) echo "Division is $(( $num1 / $num2 ))"
	;;
*) echo "Invalid Choice"
	exit 0 ;;
esac

read -p "Want to continue : (Y/N) " choice
 #choice=`$ch | tr [:lower:] [:upper:]`
done
