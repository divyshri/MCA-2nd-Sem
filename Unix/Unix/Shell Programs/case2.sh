#!/bin/bash
read -p "Enter two number" num1 num2 
echo "1. Addition"
echo "2. Subtraction"
echo "3. Multiply"
echo "4. Divide"
read -p "Enter your choice" choice
case $choice in

1) echo "Addition is " 
	echo "$num1+$num2" | bc
	;;
2) echo "Subtraction is "
	echo "$num1-$num2" | bc
	;;
3) echo "Multiplication is "
	echo "$num1*$num2" | bc
	;;
4) echo "Division is "
	echo "scale=4;$num1/$num2" | bc
	;;
*) echo "Invalid Choice"
	exit 0 ;;
esac

