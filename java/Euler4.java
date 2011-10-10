import java.util.SortedSet;
import java.util.TreeSet;
/*
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Euler4 {
	public static void main(String[] args) {

		System.out.println(largestPalindrome());
	}
	
	public static int largestPalindrome(){
		SortedSet<Integer> palindromeNumbers = new TreeSet<Integer>();
		for (int i=100;i<1000;i++){
			for (int j=i;j < 1000;j++){
				if (isPalindrome(i * j)){
					palindromeNumbers.add(i*j);
				}
			}
		}
		
		return palindromeNumbers.last();
	}
	
	public static boolean isPalindrome(int num){
		String sNum = String.valueOf(num);
		
		return (sNum.equals(reverse(sNum)));
	}
	
	public static String reverse(String str){
		return (new StringBuffer(str).reverse().toString());
	}
}
