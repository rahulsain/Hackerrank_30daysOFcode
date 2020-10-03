#!/bin/python3

import math
import os
import random
import re
import sys


# a pythonic solution


if __name__ == '__main__':
   
    n = int(input())#n is the input
    binary=bin(n)#convert n to its binary representation with suffix as 0b for ex: n=2 then binary=0b0010
    c=0
    s=[]
    max_count=-1
    for ones in binary[2:]:
        if ones=='1':
            c=c+1
        else:
            c=0
        max_count=max(max_count,c)
    print(t)
