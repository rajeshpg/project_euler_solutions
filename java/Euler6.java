/*
Find the difference between the sum of the squares of the first one hundred natural numbers 
and the square of the sum.*/
public class Euler6 {

	
	public static void main(String[] args) {
		
		System.out.println(solution(100));
		
		
	}
	
	
	public static long solution(long num){
		return squareOfSumOfN(num) - sumOfSquareOfN(num); 
	}
	public static long sumOfSquareOfN(long n){
		return ((n * (n+1) * ((2*n)+1)) / 6);
	}

	public static long squareOfSumOfN(long n){
		return square(((n*(n+1)) / 2));
	}
	
	public static long square(long n){
		return n * n;
	}
}
