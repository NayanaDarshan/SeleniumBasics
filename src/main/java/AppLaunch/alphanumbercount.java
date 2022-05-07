package AppLaunch;

public class alphanumbercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "ababa183485912648aaabbccddd";
		
		int length= str.length();
		
		String rev="";
		
		String numrev="";
		
		for(int i=0; i<length; i++) {
			
			char c =str.charAt(i);
			
			if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9') {
				numrev= numrev+str.charAt(i);;
			}
			else {
				
				rev= rev+str.charAt(i);
			}
		
			
		}
		
		System.out.println(rev);
		
		System.out.println(String.valueOf(numrev));
		

		
	}

}
