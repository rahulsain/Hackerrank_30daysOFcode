#!/bin/python3

import math
import os
import random
import re
import sys

s = "{0:b}".format(int(input()))
result, run = 0, 0

for c in s:
    if c == "1":
        run += 1
        result = max(result, run)
    else:
        run = 0
print(result)

#print(max( [len(i) for i in bin(int(input()))[2:].split('0')] ))
