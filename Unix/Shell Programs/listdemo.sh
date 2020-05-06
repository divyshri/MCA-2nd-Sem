#!/bin/bash
ans=y
while [ $ans == y ]
do
	read -p "Enter Employee ID" empid	
	read -p "Enter name" name
	read -p "Enter post" post
	read -p "Department" depar
	read -p "Date of Joining"  doj
	read -p "Salary" salary
	echo "$empid | $name | $post | $depar | $doj | $salary " >> emp.lst
	read -p "Want to Continue (y/n)" ans
done

