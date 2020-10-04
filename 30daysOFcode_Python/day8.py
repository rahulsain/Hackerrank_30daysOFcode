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
