#!/bin/bash
#Write a script that runs three commands:

#Evaluate an arithmetic expression

echo $((1+2))
echo "arthematic expression is printed above"
#Attempt to remove a file that does not exist in the current directory
rm sample.txt
#Evaluate another arithmetic expression
echo $((2*7))
echo "arthematic expression is printed above"
#Immediately after each command, echo the exit status of that command to the terminal using the appropriate variable 
#to show success and failure exit codes.

