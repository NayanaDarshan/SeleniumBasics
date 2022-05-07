package AppLaunch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionsGeneric {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

		driver.manage().window().maximize();

		// Locators

		By loginLink = By.xpath("//a[@id='ctl00_HyperLinkLogin']");

		By spiceClubMembersLink = By.xpath("//a[text()='SpiceClub Members']");

		By memberLoginLink = By.xpath("//a[text()='Member Login']");
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		linkNavigationTest(loginLink, spiceClubMembersLink, memberLoginLink);
		
	
		
		System.out.println("User performed the action");

	}

	public static WebElement getWebElement(By Locator) {

		return driver.findElement(Locator);
	}

	public static void linkNavigationTest(By Locator1, By Locator2, By Locator3) throws InterruptedException {

		WebElement link1 = getWebElement(Locator1);
		WebElement link2 = getWebElement(Locator2);
		WebElement link3 = getWebElement(Locator3);
		
		Actions act = new Actions(driver);

		act.moveToElement(link1).build().perform();
		
		act.moveToElement(link2).build().perform();
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,1000);
		 * 
		 * wait.until(ExpectedConditions.elementToBeClickable(link3));
		 * 
		 * act.moveToElement(link3).build().perform();
		 */
	 
		JavascriptExecutor js =( (JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].click();", link3);
		
		
	}
}
