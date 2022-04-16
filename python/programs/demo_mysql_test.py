import mysql.connector as mc

mydb = mc.connect(
    host="localhost",
  user="root",
  password="password"
)

print(mydb)

mycursor = mydb.cursor()
mycursor.execute("CREATE DATABASE pythondemo")
mycursor.execute("SHOW DATABASES")
for x in mycursor:
    print(x)