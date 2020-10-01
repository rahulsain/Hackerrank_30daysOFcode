class Difference:
    def __init__(self, a):
        self.__elements = a
        self.maximumDifference = 0

    # Add your code here
    def computeDifference(self):
        l = len(a)
        for i in range(0, l):
            for j in range(i + 1, l):
                difference = abs(a[i] - a[j])
                self.maximumDifference = max(difference, self.maximumDifference)
# End of Difference class

a = [int(e) for e in "1 2 5".split(' ')]

d = Difference(a)
d.computeDifference()

print(d.maximumDifference)