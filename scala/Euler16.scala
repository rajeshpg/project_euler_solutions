/*
 * What is the sum of the digits of the number 21000?
 */
object Euler16 extends App {
  def sumOfDigits(n: BigInt): BigInt = {
    n.toString.map(_.asDigit).foldLeft(0)(_ + _)
  }

  def solution(n: BigInt): BigInt = {
    sumOfDigits(n.pow(1000))
  }
  println(solution(2))
}