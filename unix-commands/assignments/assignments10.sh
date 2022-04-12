#!/bin/bash
#Create a script that, when run, will accept two command line values as arguments. These arguments should be a username and password and assigned to two variables in the script named appropriately. 
#Finally, echo those values out to the terminal when run to indicate they were read and assigned as expected.

read -p "Please enter your username: " username

read -p "Please enter your password: " password

echo "You loggedin with " $username
echo "Password for this username is" $password