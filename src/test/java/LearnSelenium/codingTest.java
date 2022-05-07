package LearnSelenium;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class codingTest {

	public static void main(String[] args) {

		/*
		 * String name = "Nayana";
		 * 
		  
		 * 
		 * getWordCount("My name is Nayana nayana");
		 * 
		 * reverseString("Nayana");
		 * 
		 * fibonacciSeries(10);		 */
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		hmap.put("Nayana", 1);
		hmap.put("Smira", 2);
		
	for(Map.Entry<String, Integer> data :	hmap.entrySet()) {
		
		System.out.println(data.getKey() +"====="+ data.getValue());
	}
		
   
	
	}

	public static void getCharCount(String name) {

		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

		char[] ch = name.toCharArray();

		for (char chardata : ch) {

			if (charMap.containsKey(chardata)) {

				charMap.put(chardata, charMap.get(chardata) + 1);

			} else {
				charMap.put(chardata, 1);
			}
		}
		System.out.println(charMap);

	}

	public static void getWordCount(String word) {

		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

		String[] words = word.toLowerCase().split(" ");

		for (String wordNames : words) {

			if (wordMap.containsKey(wordNames)) {

				wordMap.put(wordNames, wordMap.get(wordNames) + 1);

			} else {
				wordMap.put(wordNames, 1);
			}
		}
		System.out.println(wordMap);
	}

	public static void reverseString(String name) {

		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);
		}

		System.out.println(rev);
	}

	public static void fibonacciSeries(int num) {
		int m = 0;

		int n = 1;

		int Sum = 0;

		// System.out.println(n);

		for (int i = 1; i <= num; i++) {

			System.out.println(m);
			Sum = m + n;
			m = n;
			n = Sum;

		}

		System.out.println(Sum);
	}

	public static void reverseNum(int num) {

		int rev = 0;

		while (num != 0) {

			int n = num % 10;

			rev = rev * 10 + n;

			num = num / 10;

		}

		System.out.println(rev);
	}
}
