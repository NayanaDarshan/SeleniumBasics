package AppLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchApp {

	public static void main(String[] args) {

		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\SelSetup\\chromedriver.exe");
		 * 
		 * WebDriver driver = new ChromeDriver();
		 */
		
	//	webdrivermanager.chromerdriver().setup();
		

		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\SelSetup\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hubspot.com/products/marketing");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
