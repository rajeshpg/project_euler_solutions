object Euler16 extends App {
  def digitsum(n: BigInt): BigInt = {
    n.toString.map(_.asDigit).foldLeft(0)(_ + _)
  }
  
    val n:BigInt = 2
  println(digitsum(n.pow(1000)))
}