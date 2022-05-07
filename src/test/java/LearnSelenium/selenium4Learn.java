package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium4Learn {

	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.aqi.in/userlogin");
	
		
		driver.findElement(RelativeLocator.with(By.xpath("//button[@name='submitlogin']")).
			
	
	    

		
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.xpath("//button[@name='submitlogin']"))).sendKeys("Nayana");
	}

}
