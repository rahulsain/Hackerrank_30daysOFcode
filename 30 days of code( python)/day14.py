class Difference:
    def __init__(self, a):
        self.__elements = a
        self.maximumDifference = 0

	# Add your code here
    def computeDifference(self):  
        max_ = 0
        min_ = 101
        
        for i in range(len(self.__elements)):
            if max_ < self.__elements[i]:
                max_ = self.__elements[i]
            if min_ > self.__elements[i]:
                min_ = self.__elements[i]
        
        self.maximumDifference = max_ - min_
        
# End of Difference class

_ = input()
a = [int(e) for e in input().split(' ')]

d = Difference(a)
d.computeDifference()

print(d.maximumDifference)