import java.util.Arrays;

public class AnagrahamStrings {

	public static void main(String[] args) {
		String str1="Lewis";
		
		String str2 ="Elwis";
		
		if( str1.length()==str2.length()) {
			
		
			char ch[]  =str1.toLowerCase().toCharArray();
			
			char ch1[]= str2.toLowerCase().toCharArray();
			
			
			Arrays.sort(ch);
			
			Arrays.sort(ch1);
			
			if(Arrays.equals(ch, ch1)) {
				System.out.println("strings are anangraham");
			}
			else {
				System.out.println("strings are not anangraham");
			}
			
			
		}
		else {
			System.out.println("strings are not valid");
		}

	}

}
