#!/bin/python

import sys


N = int(raw_input().strip())
names = []
for a0 in xrange(N):
    firstName,emailID = raw_input().strip().split(' ')
    firstName,emailID = [str(firstName),str(emailID)]
    if (emailID.endswith('@gmail.com')):
        names.append(firstName)
        
for elem in sorted(names):
    print elem
