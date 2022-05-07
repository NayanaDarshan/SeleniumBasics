package Generics;

public class palindrome {

	public static void main(String[] args) {
		String str = "";

		int len = str.length();

		String rev="";

		for (int i = len - 1; i >= 0; i--) {
			
			rev=rev+str.charAt(i);
			
			//System.out.println(rev);

		}
		
		System.out.println(rev);
		
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("String is palindrome");
		}
		
		else {
			System.out.println("String is not palindrom");
		}
	}
	

}
