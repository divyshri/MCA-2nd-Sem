#! /bin/bash
echo $0 $1 $2 $3
arr_a=("$@")
echo ${arr_a[0]} ${arr_a[1]}
echo $@
echo $#

