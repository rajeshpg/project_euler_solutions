object Euler3{

  solution()

  def solution(): Unit = {
    var num = 600851475143L;
    println(factorize(num))
  }

  def factorize(num: Long, div: Long = 2): Long = {

    var q: Long = 0;
    var ldiv: Long = 0;

    if (num % div == 0) {
      q = num / div;
      if (isPrime(q))
        return q
      else
        return factorize(q)
    } else {
      ldiv = div + 1;
      q = num;
      return factorize(q, ldiv)
    }

  }

  def isPrime(num: Long): Boolean = {
    val maxFactor = Math.ceil(Math.sqrt(num)).toInt;
    if (num == 2) {
      return true;
    }

    for (i <- 2 until maxFactor) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

}




