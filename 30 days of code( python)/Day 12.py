class Student(Person):
    def __init__(self, firstName, lastName, idNum, scores):
        Person.__init__(self, firstName, lastName, idNum)
        self.scores = scores
        
        
            
    def calculate(self):
        average = self.scores
        try:
            average = sum(average) / len(average)
            
        except:
            average = self.scores
            
        if (90 <= average <= 100):
            return 'O'
            
        if (80 <= average < 90):
            return 'E'
            
        if (70 <= average < 80):
            return 'A'
            
        if (55 <= average < 70):
            return 'P'
            
        if (40 <= average < 55):
            return 'D'
            
        if (average < 40):
            return 'T'
                         
            
            