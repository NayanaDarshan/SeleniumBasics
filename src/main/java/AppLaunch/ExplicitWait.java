package AppLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {
	static WebDriver driver;

	static WebDriverWait wait;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://www.airasia.com/en/gb");

		driver.manage().window().maximize();
		

		By loginBtn = By.xpath("//div[text()= 'Log in now']");

		By myBookLink = By.xpath("//a[text()= 'My bookings']");

		WebElement link = elementWait(myBookLink, 5);
		System.out.println(link.getText());
		
		System.out.println(gettiledataWaitContains("Book" ,3));

		doClick(loginBtn);

	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}

	public static void doClick(By Locator) {
		getElement(Locator).click();
	}

	public static WebElement elementWait(By Locator, int time) {
		wait = new WebDriverWait(driver, time);

		return wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
	}
	
	public static String gettiledataWaitContains(String titlename, int time) {
		
		wait = new WebDriverWait(driver, time);
		
		 wait.until(ExpectedConditions.titleContains(titlename));
		 
		 String titlenme= driver.getTitle();
		 
		 return titlenme;
	
	}
	
	
	public static String getTitleDataWaitExact( String titlename, int time) {
		
		wait = new WebDriverWait(driver, time);
		
		wait.until(ExpectedConditions.titleContains(titlename));
		
		return driver.getTitle();
	}
}
