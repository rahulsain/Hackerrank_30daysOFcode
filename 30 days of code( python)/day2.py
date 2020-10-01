#!/bin/python3
# Day 2: Operators
import math
import os
import random
import re
import sys

# Complete the solve function below.
def solve(meal_cost, tip_percent, tax_percent):
    tip = (tip_percent/100) * meal_cost
    tax = (tax_percent/100) * meal_cost
    total = int(round(meal_cost + tip + tax))
    print(total)

if __name__ == '__main__':
    try:
        meal_cost = float(input())

        tip_percent = int(input())

        tax_percent = int(input())
    except:
        print("Error - Data-type mismatch.")
    else:
        solve(meal_cost, tip_percent, tax_percent)
