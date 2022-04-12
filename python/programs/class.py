class Computer:
    def config(self):
        print("i7","w10","2TB")
        
comp1 = Computer()
comp2 = Computer()
Computer.config(comp1) 
Computer.config(comp2) 
comp1.config()
comp2.config()      