package AppLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	static String browser;
	static WebDriver driver;
	static String URL;

	/*
	 * public BrowserLaunchGenerics(String browser, String URL) { this.browser =
	 * browser; this.URL = URL; }
	 */

	public WebDriver browserLaunch(String browser) {

		switch (browser) {

		case "chrome":
       //     WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SelSetup\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "firefox":

			System.setProperty("webdriver.firefox.driver", "C:\\Program Files\\SelSetup\\geckodriver.exe ");
			driver = new FirefoxDriver();
			break;

		case "safari":

			driver = new SafariDriver();
			break;

		default:
			System.out.println("Please enter the valid browser");

		}

		return driver;

	}

	/**
	 * 
	 * @param URL
	 * @return Type - void
	 */
	public void getURL(String URL) {
		System.out.println("Launching the browser.........");
		driver.get(URL);

	}

	/**
	 * Get the Title details
	 * 
	 * @return String
	 */
	public String getTitleName() {
		System.out.println("Getting the title name......");

		return driver.getTitle();
	}
	
	/*
	 * return String. Gives current title
	 */
	public String getCurrentUrl() {
		
		return driver.getCurrentUrl();
	}
	
	/*
	 * return String
	 * 
	 * Gives pageSource
	 */
	
	public String getPageSource() {
		return driver.getPageSource();
	}
	
	
	/*
	 * close the browser
	 */
	
	public void browserquit() {
		System.out.println("Quitting the browser......");
		
		driver.quit();
	}
	
	
}