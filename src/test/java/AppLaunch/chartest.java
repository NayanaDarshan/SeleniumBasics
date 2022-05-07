package AppLaunch;

import java.util.HashMap;

public class chartest {

	public static void main(String[] args) {
		String str = "nayana";

		int length = str.length();

		int count;

		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

		for (int i = length - 1; i >= 0; i--) {
			
			if(hmap.containsKey(str.charAt(i))) {
				
				count = hmap.get(str.charAt(i));
				hmap.put(str.charAt(i), ++count);
			}

			else {
				hmap.put(str.charAt(i), 1);
			}
		}
System.out.println(hmap);
	}
}