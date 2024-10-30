#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the solve function below.
def solve(s):
    s = s.split(' ')
    for i in range(len(s)):
        if len(s[i]) > 1:
            s[i] = s[i][0].upper() + s[i][1:]
        elif len(s[i]) == 1:
            s[i] = s[i][0].upper()
    s = ' '.join(s)
    return s

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = solve(s)

    fptr.write(result + '\n')

    fptr.close()
