package LearnSelenium;

import java.util.HashMap;

public class charatercount {

	public static void main(String[] args) {

		String str ="Nayana Smira";
		
		char[] ch = str.toLowerCase().toCharArray();
		

		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

		for (Character ch1 : ch) {
	 

				if (hmap.containsKey(ch1)) {
					hmap.put(ch1, hmap.get(ch1) + 1);
				} else {
					hmap.put(ch1, 1);
				}
			
			}
		
		
		System.out.println(hmap);
	}
}
			
