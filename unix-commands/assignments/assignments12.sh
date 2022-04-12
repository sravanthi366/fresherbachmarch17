#!/bin/bash
#Write a script that will prompt the user to enter a number between 1 and 3. 
#Capture that number in a variable and then test that variable. Be sure to display 
#the variable and it's value as appropriate within an if/then/else statement where the final statement will display 
#if they did not enter a number between 1 and 3 telling them they failed to follow instructions. 
#Redirect errors from each of the tests to /dev/null (to prevent script errors from showing if text is entered for example).

echo "Enter number between 1 and 3"
read a

if [[ a -eq 1 ]]
then
echo "you entered 1"
elif [[ a -eq 2 ]]
then
echo "you entered 2"
elif [[ a -eq 3 ]]
then
echo "you entered 3"
else
echo "you failed to follow instructions" >>/dev/null
fi