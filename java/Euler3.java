/*
	The prime factors of 13195 are 5, 7, 13 and 29.

	What is the largest prime factor of the number 600851475143?
 */

public class Euler3 {
	
	public static void main(String[] args) {
		System.out.println(largestPrimeFactor(600851475143L));
	}

	public static Long largestPrimeFactor(long num) {
		int div = 2;
		while (true) {
			if (num == div)
				return num;
			else if (num % div == 0) {
				num = num / div;
			} else {
				div++;
			}

		}
	}

}
