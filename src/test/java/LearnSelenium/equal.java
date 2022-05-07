package LearnSelenium;

public class equal {

	public static void main(String[] args) {
		
		String str1= "nayana";
		
		String fst=str1.substring(0, 1);
		String remst= str1.substring(1, str1.length());
		
		
		String name= fst.toUpperCase()+remst;
		
		System.out.println(name);
		
		
		
		String str2= "This is \"Nayana\" MR";
		
		System.out.println(str2);
		
				
		
		
		
		
		/*
		 * String str2="Nayan";
		 * 
		 * System.out.println(str1==str2);
		 * 
		 * System.out.println(str1.equals(str2));
		 */
	}

}
