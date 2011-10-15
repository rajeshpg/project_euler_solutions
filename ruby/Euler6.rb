# Find the difference between the sum of the squares of the first one hundred natural numbers 
# and the square of the sum.


class Euler6
  
  @square = Proc.new {|n| n*n}
  @squareOfSumOfN = Proc.new {|n| @square.call((n*(n+1))/2)}
  @sumOfSquareOfN = Proc.new {|n| ((n * (n+1) * ((2*n)+1)) / 6)}  

  def self.solution(num)
    @squareOfSumOfN.call(num) - @sumOfSquareOfN.call(num)
  end

end


puts Euler6.solution(100)
