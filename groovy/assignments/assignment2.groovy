//a) How many characters are in the string Hello, Groovy?

def str = "Hello, Groovy"

println " a question output******"
println str.length()

//b) Define a string varible clalled name. Print Hello statement with name using string concatination with groovy

def name = "Sravanthi"
println "b question output**********"
println "Hello $name"

//c) Demonstrate that 'racecar ' is a palindrome by comparing it to reverse do the same with Bob , Remove the case sensivity first

def str1 = 'raceCar'
def case1 = str1.toLowerCase()
def case2 = case1.reverse()
if(case1==case2){
    println "Given Sting 'racecar' is palindrome"
}
def str2 = 'Bob'
def case3 = str2.toLowerCase()
def case4 = str2.reverse()
if(case3==case4){
    println "Given Sting 'Bob' is palindrome"

}
    

//d) Define a string varible called sentence "Hello world how are you?" spilt the sentence into an array count the number of words do the same with tokenized method

def str4 = "Hello world how are You?"

println str4.split(" ")
println str4.tokenize('|')

//e) Using the same sentence use array notation (squre brackets ) to print the substring world

println str4[6..10]


// f) use the array notation to print the last word but reverse notation

println str4[10..6]