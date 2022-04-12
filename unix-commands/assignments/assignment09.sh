#!/bin/bash
#Write a script intended to iterate through an array called SERVERLIST 
#containing at least four values (server names). Display all four values to the terminal when run.

SERVERLIST=("ApacheHTTPServer" "NginxWebServer" "LighttpdWebServer" "ApacheTomcat")

for i in ${SERVERLIST[*]}; do
    echo "${i}"
done

