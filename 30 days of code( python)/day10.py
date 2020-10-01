#!/bin/python3

import math
import os
import random
import re
import sys

def tobinary(n):
    s = ""
    while n>0 :
        s = str(n%2) + s
        n = n//2
    return s

def func(n):
    s = tobinary(n)
    i = 0
    mx = -1
    while i < len(s):
        count = 0
        while i < len(s) and s[i] == '1' :
            count = count + 1
            i = i + 1
        mx = max(count,mx)
        if count == 0:
            i = i + 1
    return mx

if __name__ == '__main__':
    n = int(input())
    
    print( func(n) )
