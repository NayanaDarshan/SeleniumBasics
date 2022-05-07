package AppLaunch;

import java.util.HashMap;

public class vowelspgm {

	public static void main(String[] args) {
		String str= "AAAAAAASSIIIEOOU";
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		hmap.put('A', 0);
		
		hmap.put('E', 0);
		hmap.put('I', 0);
		hmap.put('O', 0);
		hmap.put('U', 0);
		
		for(int i =0; i<str.length(); i++) {
			
			if(hmap.containsKey(str.charAt(i))) {
				int count= hmap.get(str.charAt(i));
				hmap.put(str.charAt(i), ++count);
					
				}
			}
		System.out.println(hmap);
		}
	}


