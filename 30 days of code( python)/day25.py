#!/bin/python3

def isPrime(n):
    if n == 1:
        return False
    divisor = 2
    while divisor**2 <= n:
        if n % divisor == 0:
            return False
        divisor += 1
    return True

T = int(input())
while T:
    n = int(input())
    print ("Prime" if isPrime(n) else "Not prime")
    T -= 1