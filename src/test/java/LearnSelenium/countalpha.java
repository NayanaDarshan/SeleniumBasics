package LearnSelenium;

import java.util.HashMap;

public class countalpha {

	public static void main(String[] args) {


		String str= "Nayana smira darshan nayana darshan";
		
	       String str1[]= str.toLowerCase().split(" ");
		
		HashMap<String, Integer> wordmap= new HashMap<String, Integer>();
		
		for(String ch1: str1) {
			if(wordmap.containsKey(ch1)) {
				wordmap.put(ch1, (wordmap.get(ch1))+1);
				
			}
			else {
			wordmap.put(ch1, 1);
			}
		}
		
		System.out.println(wordmap);

	}

}
