#!/bin/bash
#Write a script that evaluates and displays the following arithmetic operations:

#Add two numbers
a=10
b=30
c=40
echo $(($a+$b))

#Add two numbers and multiply by a third, do not group anything

echo $((($a+$b)*$c))


#Add two numbers, grouped (changing order of precedence) and multiply by a third

echo $(($a+ ($b*$c)))

#Keep in mind special characters and/or escape characters as needed.