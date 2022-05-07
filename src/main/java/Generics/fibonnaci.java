package Generics;

public class fibonnaci {

	public static void main(String[] args) {
		int num=10;
		int m=0;
		int n=1;
		int sum=0;
				
	
		for (int i=0; i<=10; i++) {
			
			System.out.println(m);
			
	         sum=m+n;
	         n=m;
	         m=sum;
		           
			
		}
System.out.println(sum);
	}

}
