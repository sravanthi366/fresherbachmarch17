#!/bin/bash
#Develop a script that creates, sets and displays two variables to the terminal when run. 
#Within this script, add comments to explain what the script is doing, what each variable is and, 
#using inline comments, what each command is doing.

# MYUSERNAME="Terry" 
# the username for this application
MYUSERNAME="Don" # new username added later
echo "We are using the default user called: $MYUSERNAME" 
# display to the console
now="$(date +'%d/%m/%Y')"
echo "This is when the script was run: " $now
# this is the timestamp ofrun


