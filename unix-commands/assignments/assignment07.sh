#!/bin/bash
#Write a script that will use command substitution to dynamically set variable values:

#TODAYSDATE - should contain date/time stamp when executed
todaydate=$(date +%a-%y-%m-%d-%H-%M-%S)
echo $todaydate
echo "after"
alias today="$(date +%a-%y-%m-%d-%H-%M-%S)"
echo -n "$today";date
#USERFILES - the results of a find run on the /home directory to list all files owned by 'user' account
echo "enter directory name"
read dir
if [ -d $dir ]
then
echo "list of files in the directory"
ls –l $dir|egrep ‘^d’
else
echo "enter proper directory name"
fi

#Additionally, set two aliases:

#TODAY - should be an alias for the 'date' command
#UFILES - should be an alias to the full command used to set the variable USERFILES above

#Finally, display all variables and alias values when the script is run.