/*
	The prime factors of 13195 are 5, 7, 13 and 29.

	What is the largest prime factor of the number 600851475143?
*/
object Euler3 extends App {

    println(largestPrimefactor(600851475143l))

  def largestPrimefactor(num: Long, div: Long = 2): Long = {

    if (num == div)
      return num
    else if (num % div == 0)
      return largestPrimefactor(num / div)
    else
      return largestPrimefactor(num, div + 1)

  }

}




