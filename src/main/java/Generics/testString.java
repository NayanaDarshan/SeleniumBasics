package Generics;

public class testString {

	public static void main(String[] args) {
		String str= "100testing";
		
		String str2= str.replaceAll("[a-zA-Z]", "");
		
		System.out.println(str2);
		
		int a= Integer.parseInt(str2);
		
		System.out.println(a+100);
		

	}

}
