package LearnSelenium;

public class substringTest {

	public static void main(String[] args) {
		
		//string contains using substring
		
	
		
		String text= "Smira";
		
		String str1= "Nayana is walking";
		
		String str2= "Nayana is reading";
		
		
		boolean result= str1.contains(text);
		
		if(result) {
			System.out.println("In " +str1 + "The " +text+ "is present");
		}
		else {
			System.out.println("In " +str1+ "The" +text+ "is NOT present");
		}
		
		result =str2.contains(text);
		if(result) {
			System.out.println("In " +str2+ "The" +text+ "is present");
		}
		else {
			System.out.println("In " +str2+ "The" +text+ "is NOT present");
		}
	}

}
