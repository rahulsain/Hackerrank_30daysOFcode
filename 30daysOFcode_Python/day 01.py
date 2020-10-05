'''
# Day 1: Data Types
i = 4
d = 4.0
s = 'HackerRank '
# Declare second integer, double, and String variables.
# Read and save an integer, double, and String to your variables.

print(__dict__)
import sys
sys.exit(1)
newI = 0
newD = 0.0
newS = ""
try:
    newI, newD, newS = int(input()), float(input()), input()
except:
    print("Error - Data-type mismatch.")
else :
    # Print the sum of both integer variables on a new line.
    print(i + newI)
    # Print the sum of the double variables on a new line.
    print(d + newD)
    # Concatenate and print the String variables on a new line
    # The 's' variable above should be printed first.
    print(s + newS)
'''

(lambda i, d, s:  print( i+int(input()), d+float(input()), s+input(), sep='\n'     )) (    4, 4.0, 'HackerRank '   )
