package parallelExecution;

import java.util.HashMap;

public class vowelscount {

	public static void main(String[] args) {
	   String str= "AAIIOUNNA";
	   
	   int length=str.length();
	   
	   int count=0;
	   
	   HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
	   hmap.put('A', 0);
	   hmap.put('E', 0);
	   hmap.put('I', 0);
	   hmap.put('O', 0);
	   hmap.put('U', 0);

	   for( int i=0; i<length; i++) {
		   if(hmap.containsKey(str.charAt(i))) {
			   count= hmap.get(str.charAt(i));
			   hmap.put(str.charAt(i), ++count);
			   
		   }
	   }
	System.out.println(hmap);
	}

}
