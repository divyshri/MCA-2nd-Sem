#!/bin/bash
echo "Enter name"
read name
echo entered name = $name

echo Enter three name
read name1 name2 name3
echo Entered names : $name1, $name2, $name3

read -p 'username' user_var

read -p 'username:' user_name
read -sp 'password:' u_pass
insert line
echo
echo "username :" $user_name
echo "password: " $u_pass

echo "Enter names in array"
read -a names
echo "names are: ${names[0]},${names[1]},${names[5]}"

echo "enter name"
read
echo "name: $REPLY"
