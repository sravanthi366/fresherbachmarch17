f= open("hello.txt","rt")
list = f.readlines()
print(list)

list = [x.strip() for x in list]
print(list)