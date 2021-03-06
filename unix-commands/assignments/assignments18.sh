#!/bin/bash
#Create a simple text file at the command prompt. 
#This file should contain three values - CPU, Memory and Disk space for an imaginary system, all on one line and delimited with a '|' character.

#Write a script to read that file and prompt the user for the delimiter value. Use that delimiter along with the IFS variable and read those delimited values into three appropriately named variables. Finally, display them with labels, one each per line.

echo "Enter filename to parse: "
read FILE
echo "Enter the Delimiter: "
read DELIM
IFS="$DELIM"
while read -r CPU MEMORY DISK; do
echo "CPU: $CPU"
echo "Memory: $MEMORY"
echo "Disk: $DISK"
done <"$FILE"
