import mysql.connector as mc 

mydb = mc.connect(
    host = "localhost",
    user = "root",
    password = 'password',
    database = 'pythondemo'
)

mycursor = mydb.cursor()
#mycursor.execute("CREATE TABLE product(name VARCHAR(255), cost INT(255))")"""
#mycursor.execute("SHOW TABLES")
#sql = "INSERT INTO product (name,cost) VALUES (%s,%s)"
#insert many records
"""val = [("soap",40),
       ("oil",200),
       ("dal",150),
       ("sugar",150)
    
    ]"""
#mycursor.executemany(sql, val)
#mydb.commit()
#print(mycursor.rowcount, "was inserted.")
mycursor.execute("SELECT * FROM product")

result = mycursor.fetchall()
for x in result:
    print(x)