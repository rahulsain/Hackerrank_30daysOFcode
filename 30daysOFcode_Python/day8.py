# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())
phoneBook = {}
for i in range(n):
    name, phoneNo = input().strip().split(' ')
    phoneBook[name] = phoneBook.get(name, phoneNo)

phoneBookKeys = phoneBook.keys()

while 1:
    try:
        name = input().strip()
        if name in phoneBookKeys:
            print(name, phoneBook[name], sep='=')
        else:
            print('Not found')
    except:
        break
