package AppLaunch;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsTest {

	static WebDriver driver;
	static Actions act;
	static JavascriptExecutor js;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);

		WebElement Addons = driver.findElement(By.xpath("//a[text()='Add-Ons']"));
		

		WebElement login = driver.findElement((By.xpath("//a[@id='ctl00_HyperLinkLogin']")));

		WebElement spiceMembers = driver.findElement(By.xpath("//a[text()='SpiceClub Members']"));

		WebElement memberLogin = driver.findElement(By.xpath("//li[@class='hide-desktop']//a[text()='Member Login']"));

		By covidInsurance = By.xpath("//a[text()='Covid Insurance']");
		/*
		 * targetElement(Addons);
		 * 
		 * Thread.sleep(1000);
		 * 
		 * optionClick(covidInsurance);
		 */
		
		
		  Thread.sleep(1000);
		  
		  targetElement(login);
		  
		  Thread.sleep(1000);
		  
		  targetElement(spiceMembers);
		  
		  Thread.sleep(1000);
		  
		
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click() ;", memberLogin);
		 
		  //actClick(memberLogin);
		  
		 // jsclick(memberLogin);
		 
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void targetElement(WebElement element) {

		act = new Actions(driver);

		act.moveToElement(element).perform();

	}

	public static void optionClick(By locator) {

		getElement(locator).click();

	}

	public static void actClick(WebElement ele) {

		act = new Actions(driver);

		act.click(ele).perform();

	}
	
	public static void actSendData(WebElement ele, String value) {
		
		act = new Actions(driver);
		
		act.sendKeys(ele, value).perform();
	}

}
