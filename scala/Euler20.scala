
object Euler20 extends App {

  def factorial(n: Int): BigInt = n match {
    case 0 => 1
    case 1 => 1
    case _ => n * factorial(n - 1)
  }

  def solution(n: Int) = {
    factorial(n).toString.map(_.asDigit).foldLeft(0)(_ + _)
  }

  println(solution(100))

}