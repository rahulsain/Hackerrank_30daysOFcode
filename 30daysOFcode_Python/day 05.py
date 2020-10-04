#!/bin/python3
import sys
n = int(input().strip())
for i in range(1, 11): ##Loops from 1 to 10
    answer = i * n
    print(str(n) + " x " + str(i) + " = " + str(answer))
          ##+ " x " + i + " = " + (N*i))
