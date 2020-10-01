class Person:
    # a variable named age for class  
    age = 0

    def __init__(self,initialAge):
        # checking if initialage is negative or not
        if initialAge < 0:
            print("Age is not valid, setting age to 0.")
        else:
            #else assigning value to member variable
            self.age = initialAge

    def amIOld(self):
        # checking value of age using if, elif and else
        if self.age < 13:
            print("You are young.")
        elif self.age >= 13 and self.age < 18 :
            print("You are a teenager.") 
        else:
            print("You are old.")

    def yearPasses(self):
        # Increment the value of age member variable by 1 as the year passes
        self.age = self.age + 1


t = int(input())
for i in range(0, t):
    age = int(input())         
    p = Person(age)  
    p.amIOld()
    for j in range(0, 3):
        p.yearPasses()       
    p.amIOld()
    print("")