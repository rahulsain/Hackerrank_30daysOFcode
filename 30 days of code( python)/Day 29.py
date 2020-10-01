#!/bin/python

import sys


t = int(raw_input().strip())
for a0 in xrange(t):
    n,k = raw_input().strip().split(' ')
    n,k = [int(n),int(k)]
    '''
    max_diff = 0
    for i in range(1, n+ 1):
        for j in range(1, i):
            if ((j & i) > max_diff) and ((j & i) < k) and (j != i):
                max_diff = j & i
                
    print max_diff
    '''
    
    if ((k-1) | k) <= n:
        print k-1
        
    else:
        print k-2
