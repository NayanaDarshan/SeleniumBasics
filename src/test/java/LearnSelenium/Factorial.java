package LearnSelenium;

public class Factorial {

	public static void main(String[] args) {

		int num=3;
		
		int fact=1;
		
		if(num==0) {
			System.out.println("The factorial of number is 0");
		}

		else if( num>0) {
			for ( int i=1; i<=num;i++) {
				
				fact = fact*i;
			}
			
			System.out.println(fact);
		}
	}

}
