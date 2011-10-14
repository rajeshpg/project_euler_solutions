# 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder. 
# What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?


class Euler5
  def self.gcd(a,b)
    if(b==0)
      a
    else
      gcd(b, a%b)
    end
        
  end
  
  def self.lcm(a,b)
     return (a * (b / gcd(a, b)))
  end

  def self.solution()
      (1..20).reduce do |result,value|
        lcm(result,value)
      end
  end

end


puts Euler5.solution
