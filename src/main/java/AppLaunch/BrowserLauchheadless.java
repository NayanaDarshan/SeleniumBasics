package AppLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLauchheadless {
static WebDriver driver;

	public static void main(String[] args) {
		
	//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SelSetup\\chromedriver.exe");
		/*
		 * ChromeOptions co = new ChromeOptions(); co.addArguments("--headless");
		 * 
		 * driver = new ChromeDriver(co);
		 */
	WebDriverManager.chromedriver().setup();
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--incognito");
	driver = new ChromeDriver(co);
	
	
	driver.get("http://google.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.quit();

	}

}
