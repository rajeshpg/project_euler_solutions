
public class Euler5 {
	
	public static int gcd(int a,int b){
		if(b==0){
			return a;
		}else{
			return gcd(b, a%b);
		}
			
	}
	
	public static int lcm(int a,int b){
		return a * (b / gcd(a, b));
	}
	
	public static int solution(){
		int i = 1;
		int result = 1;
		while(i<=20){
			result = lcm(result,i);
			i++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(solution());
	}


}
