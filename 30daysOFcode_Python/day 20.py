#!/bin/python3

import sys

n = int(input().strip())
a = list(map(int, input().strip().split(' ')))

# Write Your Code Here
def swap(a, x, y):
    t = a[x]
    a[x] = a[y]
    a[y] = t

def bubbleSort(a):
    n = len(a)
    allSwapCount = 0
    for i in range(0, n):
        swapCount = 0

        for j in range(0, n -i- 1):

            if a[j] > a[j + 1]:
                swap(a, j, j + 1)
                swapCount += 1
        if swapCount == 0:
            break
        else:
            allSwapCount += swapCount
    return (a[0], a[n - 1], allSwapCount)


first, last, swaps = bubbleSort(a)
print("Array is sorted in", swaps, "swaps.")
print("First Element:", first)

print("Last Element:", last)

