package AppLaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GSAutoSelect {
	static WebDriver driver;
	static String AppURL = "https://google.com";
	static String browser = "chrome";

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil br = new BrowserUtil();
		driver = br.browserLaunch(browser);
		br.getURL(AppURL);
		System.out.println(br.getTitleName());
		driver.manage().window().maximize();

		ElementUtil eu = new ElementUtil(driver);

		By textfield = By.name("q");

		By searchArea = By.xpath("//div[@class='sbl1']/span");

		eu.enterText(textfield, "Darshan");
		Thread.sleep(2000);
		eu.getSearchResults(searchArea);

	}

}
