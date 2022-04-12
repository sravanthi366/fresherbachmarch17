class Computer:
    
    def __init__(self,name,age):
        
        self.name = name
        self.age = age
    def details(self):
        print("Details of person is:", self.name,self.age) 
    def compare(self,other):
        if self.age==other.age:
            return True
        else:
            return False
    
comp1 = Computer("sravs", 26) 
comp2 = Computer("navin",26)
if comp1.compare(comp2):
    print("They are same")
else:
    print("They are not same")
comp1.details()  
comp2.details()
        