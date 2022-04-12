#!/bin/bash

#Create a simple script containing a single function. 
#This function should display a message to clearly indicate it was generated when the function was run. Then, 
#display another message outside the function clearly indicating it was generated outside of it.

msg(){
    echo "It was generated when the function was run"
}
msg

echo "It was generated outside of function"




