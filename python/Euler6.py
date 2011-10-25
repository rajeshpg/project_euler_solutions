"""
Find the difference between the sum of the squares of the first one hundred natural numbers
and the square of the sum.
"""

square = lambda n: n * n
squareOfSumOfN = lambda n: square((n*(n+1))/2)
sumOfSquareOfN = lambda n: ((n * (n+1) * ((2*n)+1)) / 6)

def solution(num):
    return squareOfSumOfN(num) - sumOfSquareOfN(num)
                
