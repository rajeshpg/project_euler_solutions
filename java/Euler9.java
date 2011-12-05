/*
A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc
*/
public class Euler9 {


	public static void main(String[] args) {
		solution();
		System.out.println(java.io.File.separator);
	}

	public static int solution(){
		int result = 0;

		first: for(int a = 1; a<500 ;a++){
			for(int b = 1; b<500;b++){
				for(int c = 1; c<500;c++){
					if((a+b+c==1000) && (((a*a)+(b*b))==(c*c))){
						System.out.println(a+","+b+","+c);
						result = a * b * c;
						System.out.println(result);
						break first;
					}
									
				}
			}
		}
		
		return result;
	}
}
