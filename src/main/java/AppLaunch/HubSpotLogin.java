package AppLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLogin {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://hubspot.com");

		
		driver.manage().window().maximize();
		
		By username = By.xpath("//input[@id='username']");
		By password = By.xpath("//input[@id='password']");
		By loginBtn = By.xpath("//button[@id='loginBtn']");
		By signUp = By.xpath("//a[@class='private-link uiLinkWithoutUnderline uiLinkDark m-left-1']");

		
		 // WebElement AccptCookies = driver .findElement(By.xpath(
		 // "//div[@id='hs-en-cookie-confirmation-buttons-area']//a"));
		  
		  Actions act = new Actions(driver); 
		  //act.click(AccptCookies);
		 

		
		driver.findElement(
				By.xpath("//a[text()='Log in']//parent::li[@class='hsg-nav__group-item hsg-nav__group-item--login']"))
				.click();
		
		//waitElement(signUp, 20000);
		
		//Thread.sleep(6000);
		//getTitleDataWaitExact("HubSpot Login", 6000);
	
		

		//HubSpot Login
		
		getTitleDataWaitExact("HubSpot Login", 8000);
	
		driver.findElement(username).clear();
		act.sendKeys("nayana.28mr@gmail.com");
		
		driver.findElement(password).sendKeys("Dacchu2128#");
		
        driver.findElement(loginBtn).click();
	}

	
	  public static void waitElement(By Locator, int timeout) {
	  
	  WebDriverWait wait = new WebDriverWait(driver, timeout);
	  wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locator))); }
	 
	
	public static String getTitleDataWaitExact(String titlename, int time) {

		WebDriverWait wait = new WebDriverWait(driver, time);

		wait.until(ExpectedConditions.titleContains(titlename));

		return driver.getTitle();
	}
	
}
