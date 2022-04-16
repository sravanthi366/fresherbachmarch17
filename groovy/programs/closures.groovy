//closures

def str = "Hello"

def myClosure1 = {name-> println "$str $name"}
myClosure1.call("Sravanthi")

def func(clos ){
    clos.call("groovy")
}

func(myClosure1)

def myClosure2 = {

    a,b,c ->
    return (a+b+c)
}
def res = myClosure2(10,20,30)
println res