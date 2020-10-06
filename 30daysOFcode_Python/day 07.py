import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    for i in range(n//2):
        arr[i], arr[-1 * (i + 1)] = arr[-1 * (i + 1)], arr[i]
    
    print(*arr)

#(lambda _, arr : print(*arr[::-1], sep=' ') ) ( int(input()),   list(map(int, input().strip().split()))  )
