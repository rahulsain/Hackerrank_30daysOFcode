#!/bin/python

import sys

full_array = []
for rows in range(6):
    arr_row = map(int, raw_input().strip().split(' '))
    full_array.append(arr_row)
    

max_sum = -100
for i in range(0, 6):

    for j in range(0, 6):

        try:
            top = full_array[i][j] + full_array[i][j+1] + full_array[i][j+2]
            #print "top:", top
            mid = full_array[i+1][j+1]
            #print "mid:", mid
            bottom = full_array[i+2][j] + full_array[i+2][j+1] + full_array[i+2][j+2]
            #print "bottom:", bottom
            hg_sum = top + bottom + mid
            #print "hg sum: ", hg_sum
            if (hg_sum > max_sum):
                max_sum = hg_sum
         
        except:
            continue
    
print max_sum
    

    
