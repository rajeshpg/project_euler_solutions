# A palindromic number reads the same both ways. 
# The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
# Find the largest palindrome made from the product of two 3-digit numbers.

class Euler4
  def self.largestPalindrome
    num = 0
    (100..1000).each do |i| 
      (i..1000).each do |j| 
        temp = i*j
        if (isPalindrome?(temp.to_s) && temp > num)
         num = temp
        end
      end
    end
    num
  end
  
  def self.solution
    puts largestPalindrome 
  end

  def self.isPalindrome?(str)
    str.reverse == str
  end

end


Euler4.solution
