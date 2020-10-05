#!/bin/python3

import math
import os
import random
import re
import sys


def solve(n, k):
    if not k % 2 and k|k-1 > n:
        return k-2
    return k-1

for _ in range(int(input())):
    n, k = list(map(int, input().split()))
    print(solve(n, k))
