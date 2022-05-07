package com.qa.SeleniumBasics.Pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		printArrayListData();
		//WebDriverManager.chromedriver().setup();
		
		/*
		 * driver= new ChromeDriver();
		 * 
		 * driver.get("");
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * Select sel = new Select();
		 * 
		 * sel.selectByIndex(1);
		 * 
		 * sel.selectByVisibleText("Nayana");
		 * 
		 * sel.selectByValue("value");
		 * 
		 * 
		 * List<WebElement> dropdownnames =sel.getOptions();
		 * 
		 * for(WebElement ele : dropdownnames) { System.out.println(ele.getText()); }
		 * 
		 * sel.deselectAll(); //UnsupportedOperations Exception
		 */
	}

	
	public static void printArrayListData() {
		
		List<String> monthdata = new ArrayList<String>(Arrays.asList("January", "Febuary","March", "April", "May","June","July"));
		
		monthdata.stream().forEach(ele-> System.out.println(ele));
		
		for(String monthlist : monthdata) {
			System.out.println(monthlist);
		}
	}
}
