package com.qa.SeleniumBasics.PageTest;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.SeleniumBasics.Pages.RegisterPage;
import com.qa.SeleniumBasics.Utils.getData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class freshWorksRegisterPageTest {
	public static WebDriver driver;
	
	public RegisterPage registerpage;

	@BeforeClass
	public void setUp() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().window().setPosition(new Point(0,2000));

		driver.get(
				"https://www.freshworks.com/crm/signup/?_ga=2.218472473.1268976619.1622372397-1214904770.1622372397&_gac=1.251608308.1622372433.Cj0KCQjw78yFBhCZARIsAOxgSx2qFr70_PO0WmbrJkExFiEVR7Iiagwgt1yvaRl7tt26-NRtZQLe5DQaAlJ7EALw_wcB");
		
		System.out.println(driver.getTitle());
		registerpage= new RegisterPage(driver);

	}

	@DataProvider
	public Object[][] getExcelData() {

		Object data[][] = getData.getExcelData("RegisterData");

		return data;
	}

	@Test(dataProvider = "getExcelData")
	public void enterRegisterdata(String firstname, String lastname, String emailID, String company, String phone) {

		registerpage.doRegister(firstname, lastname, emailID, company, phone);
	}

}
