// what is method
// how to create method
// method parameters
// return type
// Instance methods

def hello(){
    println "Helooo.."
}
hello()

def sum(int a, int b){

    println "Sum is " + (a+b)
}
sum(5,7)

def sub(int c, int d){

    def e = c-d
    return e
}

def result = sub(30,10)
println result