package com.qa.SeleniumBasics.PageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreshworksSignUpPage {

	public static WebDriver driver;

	@BeforeClass
	public void setUp() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@Test
	public void getTitleTest() {

		String titlename = driver.getTitle();
		
		System.out.println(titlename);

		Assert.assertEquals(titlename, "A fresh approach to customer engagement");
	}

	@Test
	public void getURLTest() {

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.freshworks.com/");
	}
}
