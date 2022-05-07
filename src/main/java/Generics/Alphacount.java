package Generics;

import java.util.HashMap;

public class Alphacount {

	public static void main(String[] args) {
		
		String test= "I love Java";
		
		System.out.println(test.length());
		
		System.out.println(test.substring(7, 11));
	
		
		System.out.println(test.indexOf('a', 1));
		
		System.out.println(test.indexOf('a', test.indexOf('a', 1)+1));
		
		
		String str="nayana";
		int len= str.length();
		int count;
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		for( int i=len-1;i>=0; i--) {
			
			if( hmap.containsKey(str.charAt(i))) {
				count= hmap.get(str.charAt(i));
				hmap.put(str.charAt(i), ++count);
			}
			else {
				hmap.put(str.charAt(i), 1);
			}

		}
	
		System.out.println(hmap);
	}
	

}
