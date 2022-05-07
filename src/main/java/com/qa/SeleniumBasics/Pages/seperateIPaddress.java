package com.qa.SeleniumBasics.Pages;

public class seperateIPaddress {

	public static void main(String[] args) {

		String str = "2001:0dc5:72a3:0000:0000:802e:3370:73E4";

		String str1[] = str.split(":");

		String id = "";
		for (String str2 : str1) {
			System.out.println(str2);
			id = str;
		}
		System.out.println(id.replaceAll("[^0-9]", ""));

	}

}
