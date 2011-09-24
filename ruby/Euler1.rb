class Euler1
#   Add all the natural numbers below one thousand that are multiples of 3 or 5.
#   eg: If we list all the natural numbers below 10 that are multiples of 3 or 5,
#   we get 3, 5, 6 and 9. The sum of these multiples is 23.

  def self.solution

    (1..999).select{|num| ((num % 3 == 0) || (num % 5 == 0))}.inject{|a,b| a+b}

  end

end

