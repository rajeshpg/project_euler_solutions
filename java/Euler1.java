public class Euler1 {
	/**
	 * Add all the natural numbers below one thousand that are multiples of 3 or
	 * 5.
	 * 
	 * eg: If we list all the natural numbers below 10 that are multiples of 3
	 * or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 */
	public static int sum() {
		
		int i = 0;
		int result = 0;
		while(i<1000){
			if((i % 3 == 0) || (i % 5 ==0)){
				result += i;
			}

			i++;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(Euler1.sum());
	}
	

}
