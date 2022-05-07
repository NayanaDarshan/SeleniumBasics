package com.qa.SeleniumBasics.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

	public static WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		
		this.driver=driver;
	}
	//Locators
	
	private  By firstname = By.xpath("//input[@name='first-name']");
	private  By lastname=By.xpath("//input[@name='last-name']");
	private  By emailid=By.xpath("//input[@name='email']");
	private  By company=By.xpath("//input[@name='company']");
	private  By phonenumber=By.xpath("//input[@name='phone']");
	
	public  void doRegister(String firstName, String lastName, String emailId, String Company, String Phonenumber) {
		
		driver.findElement(firstname).sendKeys("firstName");
		driver.findElement(lastname).sendKeys("lastName");
		driver.findElement(emailid).sendKeys("emailId");
		
		driver.findElement(company).sendKeys("Company");
		
		driver.findElement(phonenumber).sendKeys("Phonenumber");
		
		driver.navigate().refresh();
		
		
	}
	
}
