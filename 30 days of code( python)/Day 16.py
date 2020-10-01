#!/bin/python

import sys


S = raw_input().strip()


try:
    ans = int(S)
    print ans

except ValueError as Exception:
    print "Bad String"