# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())
d = {}
while n>0 :
    s = input().strip().split()
    d[s[0]] = s[1]
    n = n-1

while True:
    try:
        temp = input()
        if temp in d.keys():
            print( temp+"="+d[temp] )  
        else:
            print("Not found")
    except:
        break