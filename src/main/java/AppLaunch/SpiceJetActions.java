package AppLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetActions {

	static WebDriver driver;
	static String appURL;
	static String browser;
	static Actions act;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil br = new BrowserUtil();
		browser = "chrome";
		driver = br.browserLaunch(browser);
		appURL = "http://spicejet.com";

		driver.get(appURL);

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());

		ElementUtil eu = new ElementUtil(driver);

		Thread.sleep(2000);

		// WebElement
		WebElement Addons = driver.findElement(By.xpath("//a[text()='Add-Ons']"));

		WebElement login = driver.findElement((By.xpath("//a[@id='ctl00_HyperLinkLogin']")));

		WebElement spiceMembers = driver.findElement(By.xpath("//a[text()='SpiceClub Members']"));

		WebElement memberLogin = driver.findElement(By.xpath("//li[@class='hide-desktop']//a[text()='Member Login']"));

		WebElement covidInsurance = driver.findElement(By.xpath("//a[text()='Covid Insurance']"));
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		
		wait.until(ExpectedConditions.visibilityOf(Addons));
		

		//level1MoveToElement(Addons, covidInsurance);
		
		level2MoveToElement(login,spiceMembers,memberLogin);

		/*
		 * eu.singleMouseHover(Addons);
		 * 
		 * Thread.sleep(1000); eu.optionClick(covidInsurance);
		 */

		/* twoLinkMouseOver(login, spiceMembers); */

		/*
		 * eu.singleMouseHover(login);
		 * 
		 * Thread.sleep(1000);
		 * 
		 * eu.singleMouseHover(spiceMembers);
		 */

	

		/*
		 * JSUtil js = new JSUtil(driver);
		 * 
		 * Thread.sleep(1000);
		 * 
		 * js.JSElementClick(memberLogin);
		 */

	}

	public static void twoLinkMouseOver(WebElement Locator1, WebElement Locator2) throws InterruptedException {

		act = new Actions(driver);
		act.moveToElement(Locator1).perform();

		Thread.sleep(1000);

		act.moveToElement(Locator2).perform();
	}

	public static void level1MoveToElement(WebElement e1, WebElement e2) {

		Actions act = new Actions(driver);

		act.moveToElement(e1).perform();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOf(e2));

		act.click(e2).perform();
	}

	public static void level2MoveToElement(WebElement e1, WebElement e2, WebElement e3) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		Actions act = new Actions(driver);

		act.moveToElement(e1).perform();

		wait.until(ExpectedConditions.visibilityOf(e2));
		act.moveToElement(e2).perform();

		//wait.until(ExpectedConditions.visibilityOf(e3));
		
		act.moveToElement(e3).perform();

		act.click(e3).perform();

	}

}
