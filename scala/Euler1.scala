object Problem1 {
	/**
	 * Add all the natural numbers below one thousand that are multiples of 3 or
	 * 5.
	 * 
	 * eg: If we list all the natural numbers below 10 that are multiples of 3
	 * or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 */
  def sum(): Int = {
    (1 until 1000).map(num => if ((num % 3 == 0) || (num % 5 == 0)) num else 0).reduceLeft[Int](_ + _)
  }
  
}


