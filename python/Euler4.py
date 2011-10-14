"""
A palindromic number reads the same both ways. 
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
Find the largest palindrome made from the product of two 3-digit numbers.
"""

def solution():
    print(largestPalindrome())
                
def isPalindrome(str):
    return (str == str[::-1])


def largestPalindrome():
    num = 0
    for i in range(100,1000):
        for j in range(i,1000):
            temp = i*j
            if(isPalindrome(str(temp)) and temp > num):
                num = temp
    return num        

