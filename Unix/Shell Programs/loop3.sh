#!/bin/bash
count="Y"
until [ $count != "Y" ]
do
read -p "Do you want to continue (Y/N)" count
done
