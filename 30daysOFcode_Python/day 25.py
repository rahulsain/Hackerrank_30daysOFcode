#!/bin/python3

def isPrime(n):
  
    if n < 2:
        return False
    i = 2
    while i**2 <= n:
        if n % i:
            i += 1
        else:
            return False
    return True

n = int(input())
values = [int(input()) for _ in range(n)]

for v in values:
    if isPrime(v):
        print("Prime")
    else:
        print("Not prime")
