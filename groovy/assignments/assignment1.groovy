/* Write a method called isPrime that takes an integer argument and returns a Boolean Determine the number is prime by deviding it by all numbers from  2 to one less than the number  */


def isPrime(int value){

    def result = true

    for(int i=2; i<value; i++){

        if(value%i==0){

            result = false
            break
        }
    }
return result

}

println isPrime(10)
println isPrime(19)



