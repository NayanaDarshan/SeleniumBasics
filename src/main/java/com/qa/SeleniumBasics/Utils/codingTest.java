package com.qa.SeleniumBasics.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class codingTest {

	public static Set<String> uniqueList = new HashSet<String>();

	public static void main(String[] args) {

		/*
		 * [2:49 PM] Anand Dandekar input :
		 * {"Persistent","PERSISTENT","ABC","abcd","   ", "abc"}
		 * 
		 * [2:50 PM] Anand Dandekar output : {"persistent","ABC", "abcd", " "}
		 */

		ArrayList<String> input = new ArrayList<String>(
				Arrays.asList("Persistent", "PERSISTENT", "ABC", "abcd", " ", "abc"));

		
		// ArrayList<String> newList = new ArrayList<String>(uniqueList);

		for (int i = 0; i < input.size(); i++) {

			String name = input.get(i).toLowerCase();

			uniqueList.add(name);

		}
		
		ArrayList<String> newList = new ArrayList<String>(uniqueList);

		for (String s : newList) {
			System.out.println(newList);
		}
	}
	
}


