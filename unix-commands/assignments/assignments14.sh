#!/bin/bash
#Develop a simple three item menu to display on the terminal. 
#Your script, upon display of the menu, should prompt the user to choose one of the three available options. 
#Using the 'case' statement from the course, display three unique messages depending on which number they chose, 
#with a catch all message letting them know if they went outside the bounds of instructions

PS1='Please enter your choice: '
options=("Option 1" "Option 2" "Option 3" "Quit")
select opt in "${options[@]}"
do
    case $opt in
        "Option 1")
            echo "you chose choice 1"
            ;;
        "Option 2")
            echo "you chose choice 2"
            ;;
            
        "Option 3")
            echo "you chose choice $REPLY which is $opt"
            ;;
        "Quit")
            break
            ;;
        *) echo "invalid option $REPLY";;
    esac
done