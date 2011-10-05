# The prime factors of 13195 are 5, 7, 13 and 29.
#
# What is the largest prime factor of the number 600851475143?
require 'prime'

class Euler3
  def self.solution
    largestPrimeFactor(600851475143)
  end

  def self.largestPrimeFactor(num)
    Prime.each do |prime_num|
       break if num==prime_num
       num /= prime_num while num % prime_num == 0
    end
    num
  end

end


puts Euler3.solution