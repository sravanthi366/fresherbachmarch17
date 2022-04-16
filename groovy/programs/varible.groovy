//To define a varible we can use letters digits and _
// Groovy is casesensitive language.
def name = "Sravanthi"
String name1 = "Ram"

//to define a variable using def and datatype is good practice.

//println(name)
print(name1)

print name+name1

//groovy is dynamically typed so we can change the value of variable at runtime

name = 20
println(name)

// definining multiple varible at a time

def (String a, int b, Double c) = [10,20,30]
println(a)
println(b)
println(c)