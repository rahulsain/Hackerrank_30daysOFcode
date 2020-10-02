# 30 days of code Day6 solution in Python 3 Hackerrank
strings = []
for _ in range(int(input())):
    strings.append(input())

for word in strings:
    odd = ""
    for i in range(len(word)):
        if (i%2 == 0):
            print(word[i],end="")
        else:
            odd +=word[i]
    print(f" {odd}")
