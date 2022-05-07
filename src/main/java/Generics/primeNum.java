package Generics;

public class primeNum {

	public static void main(String[] args) {
		
		int num=7;
		int m =num/2;
		int flg=0;
		
		
		if(num==0) {
			System.out.println("NUmber is not prime");
		}
		
		else {
			for (int i=1; i<=m;i++) {
				
				if(num%i==0) {
					System.out.println("The number is not prime number" +num );
					flg=1;
					break;
				}
				
				
			}
			if( flg==0) {
				System.out.println("The number is prime" +num);
			}
		}
	}
	

}
