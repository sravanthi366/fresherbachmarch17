#!/bin/bash
#Create a simple text file containing a list of super heros (or some names if preferred), use at least four values, one per line in the file.

#Write a bash shell script that then reads that file and displays it line by line on the terminal window.

echo "enter a filename:\c"
 read fname
 if [ -z "$fname" ]
 then
      exit
 fi    
  terminally='tty'
exec < $fname
  count=1
  while read line
  do
    echo $count.$line

  done  