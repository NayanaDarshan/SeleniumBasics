package LearnSelenium;

import java.util.HashMap;

public class vowlescount {

	public static void main(String[] args) {
		String str= "NAYANA";
		
		int len= str.length();
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		hmap.put('A', 0);
		hmap.put('E', 0);
		hmap.put('I', 0);
		hmap.put('O', 0);
		hmap.put('U', 0);
		
		for( int i =0; i<len; i++ ) {
			if(hmap.containsKey(str.charAt(i))) {
			int count=	hmap.get(str.charAt(i));
			hmap.put(str.charAt(i), ++count);
			}
		}
	System.out.println(hmap);
	}

}
