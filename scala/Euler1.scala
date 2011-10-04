object Euler1 {
	/**
	 * Add all the natural numbers below one thousand that are multiples of 3 or
	 * 5.
	 * 
	 * eg: If we list all the natural numbers below 10 that are multiples of 3
	 * or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 */
  def solution(): Int = {
    (1 until 1000).filter(num => ((num % 3 == 0) || (num % 5 == 0)) ).reduceLeft[Int](_ + _)
  }
  
}


