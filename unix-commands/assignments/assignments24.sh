#!/bin/bash
#We are going to use nested functions to simulate the kind of abstraction you find in many object oriented languages. Create the following structures in your script:

#a function that defines two local variables to hole the number of arms and legs that a human being has.
#nested functions, one for each a male and female, that contain the appropriate number of beards that each gender has.
#capture the gender as a command line parameter.
#test the command line parameter and call the appropriate functions in order to display the characteristics of the indicated gender.

human(){
    legs=2
    arms=2

    echo "Number of arms that human has $arms"
    echo "Number of legs that humbeing has $legs"
   
    male(){
        echo "number of beards male has 1"
        
    }
    male
        female(){
            echo "number of beards female has 0"
    }
    female
}

human
