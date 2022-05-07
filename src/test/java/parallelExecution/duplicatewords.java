package parallelExecution;

import java.util.HashSet;
import java.util.Set;

public class duplicatewords {

	//to get the duplicate words index
	
	public static void main(String[] args) {
		String str= "Hello world";

		char[] chararray = str.toCharArray();
		
		Set<Character> set = new HashSet<Character>();
		
		for( int i=0; i< chararray.length; i++) {
			
			if(!set.add(chararray[i])) {
				
				System.out.println("The index of duplicate words are===>" +i+" and character is===>" +chararray[i]);
				
			}
		}
	}

}
