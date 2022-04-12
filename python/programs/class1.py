class Computer:
    def __init__(self,cpu,ram):
        
        self.cpu=cpu
        self.ram=ram
    def config(self):
        print("config is:",self.cpu,self.ram)  
comp1 = Computer("amd 8",8)
comp1.config()          
        