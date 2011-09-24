import math

'''
Add all the natural numbers below one thousand that are multiples of 3 or 5.
eg: If we list all the natural numbers below 10 that are multiples of 3 or 5,
we get 3, 5, 6 and 9. The sum of these multiples is 23.
'''

def solution():
    num = range(0, 1000)
    result = 0
    for n in num:
        if((n % 3 == 0) or (n % 5 == 0)):
                result += n
    return result
