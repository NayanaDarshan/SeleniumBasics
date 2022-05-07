
public class reverseNum {
	
	public static void main(String [] args) {
		
		int num=12345;
		
		String name= "Nayana";
		
		String revstring= "";
		
		
		   while(num>0) {
		  
		  int n= num%10; System.out.print(n); num= num/10;
		  
		  
		  }
		 
		
		for(int i = name.length()-1; i>=0; i--) {

	         revstring= revstring+name.charAt(i);	
		}
		System.out.println(revstring);
		
	}

}
