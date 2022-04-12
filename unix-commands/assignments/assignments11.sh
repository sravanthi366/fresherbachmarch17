#!/bin/bash
#Create a script that interacts with the user. 
#Prompt them to guess a secret number between 1 and 5. 
#Read the guess from the terminal and assign it to a variable. 
#Using the 'if' statement from the course, test that value to determine 
#if they guessed the right number (you choose the correct value). If they do, display a success message, otherwise do nothing.

read -p "Guess the secret number between 1&5: " number

if [ 2 -eq $number ]
then
    echo "Good! you have given a correct guess."
fi