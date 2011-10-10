
/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
*/
object Euler5 extends App {
  
  def solution():Unit = {
    val res = Stream.from(1) takeWhile (evenlyDivisible(_)) last
    
    println(res)
          
  }
  
  def evenlyDivisible(num: Long, div: Long = 2): Boolean = {
    if(div == 10 && num % div == 0)
      return true
      else if(num % div == 0)
        return evenlyDivisible(num,div+1)
   else return false;
      
  }

  solution
}