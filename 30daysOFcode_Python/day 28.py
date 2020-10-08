#!/bin/python3

import re

result = list()

for _ in range(int(input())):
    firstNameEmailID = input().split()
    firstName = firstNameEmailID[0]
    emailID = firstNameEmailID[1]

    if re.compile("@gmail.com$").search(emailID):
        result.append(firstName)

for name in sorted(result):
    print(name)
