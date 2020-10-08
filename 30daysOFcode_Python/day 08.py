phonebook = {}
num = int(input())
for i in range(0, num):
    entry = str(input()).split(" ")
    name = entry[0]
    number = int(entry[1])
    phonebook[name] = number

for i in range(0, num):
    name = input()
    if name in phonebook:
        print(name + "=" + str(phonebook[name]))
    else:
        print("Not found")

#( lambda phonebook : [   (lambda name: print(  f'{name}={phonebook[name]}' if name in phonebook else 'Not found' ) )(input())     for _ in range(len(phonebook))    ]   )    (  dict([ input().split() for i in range(int(input()))  ] )   )
