#!/bin/bash
#Create a script that interacts with the user. 
#You will want to prompt the user to enter the following information 
#(which you will capture and place into the following variables):

#FIRSTNAME
#LASTNAME
#USERAGE

#Greet the user with their name and current age displayed and then calculate and display their age in 10 years.

read -p "Please enter your first name:" finame
read -p "Please enter your last name:" lname
read -p "Please enter your age:" age

echo 'FirstName - '$finame
echo 'LastName - '$lname
echo 'UserAge - '$age
echo "Hello $finame you are $age years old. your age in next ten years is" $(($age+10))