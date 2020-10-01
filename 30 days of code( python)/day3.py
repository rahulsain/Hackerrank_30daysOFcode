#!/bin/python3
# Day 3: Intro to Conditional Statements
import math
import os
import random
import re
import sys

if __name__ == '__main__':
    try:
        N = int(input())
    except:
        print("Error - Data-type mismatch.")
    else:
        if N in range(1,101):
            if N % 2 != 0:
                print("Weird")
            elif N % 2 == 0:
                if N in range(2,6) or N > 20:
                    print("Not Weird")
                elif N in range(6, 21):
                    print("Weird")
