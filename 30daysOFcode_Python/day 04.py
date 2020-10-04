# 30 days of code Hackerrank solution in Python3
class Person:
    age = 0
    def __init__(self,initialAge):
        if(initialAge >=0):
            self.age  = initialAge
        else:
            print("Age is not valid, setting age to 0.")
            self.age = 0
        # Add some more code to run some checks on initialAge
    def amIOld(self):
        if(self.age < 13):
            print("You are young.")
        elif(self.age>=13 and self.age<18):
            print("You are a teenager.")
        else:
            print("You are old.")
        # Do some computations in here and print out the correct statement to the console
    def yearPasses(self):
        self.age+=1
        # Increment the age of the person in here

t = int(input())
for i in range(0, t):
    age = int(input())         
    p = Person(age)  
    p.amIOld()
    for j in range(0, 3):
        p.yearPasses()       
    p.amIOld()
    print("")
