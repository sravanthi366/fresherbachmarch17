class Parent:
    def __init__(self, name):
        self.name=name
    def show(self):
        print(self.name)
class Child(Parent):
    def __init__(self, name):
            self.name=name
    

p = Parent("Sravanthi")
ch = Child("Sravs")

ch.show()