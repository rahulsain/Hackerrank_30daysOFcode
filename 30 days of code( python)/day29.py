#!/bin/python3

import math
import os
import random
import re
import sys

if __name__ == '__main__':
    t = int(input())

    for t_itr in range(t):
        nk = input().split()
        n = int(nk[0])
        k = int(nk[1])

        maximum = 0
        for a in range(n-1, 1, -1):
            for b in range(n, a, -1):
                ab = a&b
                if ab < k and ab > maximum:
                    maximum = ab
                if maximum == k-1:
                    break
            if maximum == k-1:
                break
        print(maximum)
