/*
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
object Euler4 extends App {
  println(largestPalindrome)
  def largestPalindrome(): Int = {
    (for (i <- 100 to 1000; j <- i to 1000 if(isPalindrome((i*j).toString))) yield (i*j)).sortWith(_<_).last  
  }

  def isPalindrome(str: String): Boolean = {
    str.reverse.equals(str);
//    return str.equals(revStr);
  }
}