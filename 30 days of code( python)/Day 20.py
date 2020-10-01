#!/bin/python

import sys


n = int(raw_input().strip())
a = map(int,raw_input().strip().split(' '))

def bubble_sort(array):
    num_of_swaps = 0
    for i in range(len(array)):
        for index in range(len(array)):
            try:
                if (array[index] > array[index + 1]):
                    temp = array[index]
                    array[index] = array[index + 1]
                    array[index + 1] = temp
                    num_of_swaps = num_of_swaps + 1
                
            except:
                continue
            
            
    return [num_of_swaps, array[0], array[-1]]
 
result = bubble_sort(a)
print "Array is sorted in", result[0], "swaps."
print "First Element:", result[1]
print "Last Element:", result[2]