/*
Find the difference between the sum of the squares of the first one hundred natural numbers 
and the square of the sum.*/
object Euler6 extends App{
	val squareOfSumOfN: Long => Long = n => square(((n*(n+1)) / 2))
	val sumOfSquareOfN: Long => Long = n =>  ((n * (n+1) * ((2*n)+1)) / 6)
	val square: Long => Long = (x) => x * x
  
	def solution(num: Long):Long = {
	  squareOfSumOfN(num) - sumOfSquareOfN(num) 
	}
	
	println(solution(100))
	
}