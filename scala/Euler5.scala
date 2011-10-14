
/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
*/
object Euler5 extends App {

  val gcd: (Int, Int) => Int = (a, b) => if (b == 0) a else gcd(b, a % b)
  val lcm: (Int, Int) => Int = (a, b) => a * (b / gcd(a, b))

  def solution(): Long = {
    Stream.from(1) take(20) reduceLeft(lcm(_, _))
  }

  println(solution)
}