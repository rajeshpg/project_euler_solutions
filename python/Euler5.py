"""
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
"""

def solution():
    return reduce(lambda x,y: lcm(x,y), range(1,20))
                
def gcd(a,b):
    if(b==0):
        return a
    else:
        return gcd(b, a%b)
    
    
def lcm(a,b):
    return (a * (b / gcd(a, b)))       

