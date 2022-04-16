// decision making statements

// if-else and switch case

def num = 11

if(num==10){
    print "number is 10"
}
else{
    println "number is not 10"
}
// to check number is +ve or num -ve
def number = 11
if(number>0)
    println "number is +ve"
else if(number == 0)
    println "number is zero"
else 
    println "number is +ve"

    // swich case

    def x = 0
    

switch(x){
    case 0 :
        println "x is zero"
        break;
    case {x>0}:
        println "x is +ve"
        break;
    case {x<0}:
        println " x is -ve"
        break;
    default: 
        println "invalid number"
        break;
}


