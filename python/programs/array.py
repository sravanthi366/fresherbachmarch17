
from array import*

vals = array("i", [1, 2, 3, 4, 5, 5])

"""for e in vals:
    print(e)"""

"""for i in range(len(vals)):
      print(vals[i])  """
#append in the last in array      
"""vals.append(78)
print(vals)"""
#vals.buffer_info()

#vals.byteswap()
#Gives the count of the element in the array
"""vals.count(5)
print(vals)"""
#extends the array
"""vals.extend([67, 78, 67, 89])
print(vals)"""

"""vals.index[2]
print(vals)"""

arr = array('i',[])
n = int(input("Hello Usr please enter the length of the array: "))

"""for i in range(n):
    x = int(input("Enter the next value: "))
    arr.append(x)
print(arr)
val = int (input("Enter the value for search"))
k=0
for e in arr:
    if e==val:
        print(k)
        break
    k+=1
#arr.index    
print(arr.index(val))"""
print(dir(arr))
r=arr.reverse()
print(r)