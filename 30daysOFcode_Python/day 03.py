'''
#!/bin/python
# compatible with python3
import sys


n = int(input().strip())

# if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
if n%2==1:
    ans = "Weird"

elif n>20:
    ans = "Not Weird"

elif n>=6:
    ans = "Weird"

else:
    ans = "Not Weird"

print(ans)
'''

(lambda n : print( "Weird" if  n%2 else "Not Weird" if 2<=n<=5 else "Weird" if 6<=n<=20 else "Not Weird"     ) ) ( int(input().strip()))
