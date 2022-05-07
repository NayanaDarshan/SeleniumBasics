package Generics;

public class Armstrngnum {

	public static void main(String[] args) {
	
		int num=153;
		int temp=num;
		int count=0;
		
		while(num>0) {
			
			int r= num%10;
			
		    num= num/10;
			
			count= count+(r*r*r);
		}
		
		if(temp==count) {
			System.out.println("The number is Armstrong");
		}
		else {
			System.out.println("The number is NOT armstrong");
		}
	}

}
