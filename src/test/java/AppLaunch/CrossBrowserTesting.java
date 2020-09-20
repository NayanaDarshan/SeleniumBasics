package AppLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting {

	static WebDriver driver;
	static String URL = "http://google.com";

	public static void main(String[] args) {

		launchBrowser("chrome");

		driver.get(URL);
		System.out.println(driver.getTitle());
		driver.navigate().to("http://gmail.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().forward();

		driver.close();
		//System.out.println(driver.getTitle());

	}

	public static WebDriver launchBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			
         System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SelSetup\\chromedriver.exe");

			driver = new ChromeDriver();
		
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\SelSetup\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else {
			System.out.println("please enter the valid browser");
		}

		return driver;

	}

}
