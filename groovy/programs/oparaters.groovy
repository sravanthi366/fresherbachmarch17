// Operators are symbols that tell the compailer to perform some specific operation

// Arthematic operations

assert 1 + 2 == 3
assert 4 - 3 == 1
assert 3 * 5 == 15
assert 20 / 4 == 5
assert 20 % 5 == 0
assert 2 ** 3 == 8

//unary operatorts

assert +3 == 3
assert -4 == -4
assert -(-1) == 1

//increment & decrement

int i = 10
println (++i)
println (i++)

// assignment operators
def a =4
a += 3

assert a == 7

//relational oparators
assert 1 + 2 == 3
assert 3 != 4
assert 2 < 3
assert 2 <= 2
assert 4 > 3
assert 4 >= 4
//logical operators

assert !false
assert true && true
assert true || false
//Bitwise operator

// conditional operators

assert (!true) == false
assert (!'foo') == false
assert (! '') == true
// ternary operator

result = 1>0 ? "1 is greator" : "not greator"
println result