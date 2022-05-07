package Generics;

public class armsStrong {

	public static void main(String[] args) {
		int num=678;
		
		int r;
		int t;
		int cube=0;
		
		t=num;
		
		while(num>0) {
			r= num%10;
			num=num/10;
			cube= cube+(r*r*r);
		}

		if(t==cube) {
			System.out.println("Number is armsstrong");
		}
		else {
			System.out.println("Number is not armsstrong");
		}
	}

}
