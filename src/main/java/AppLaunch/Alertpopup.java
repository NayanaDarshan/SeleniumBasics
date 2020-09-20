package AppLaunch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertpopup {
static WebDriver driver;
static Alert alert;

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://rediffmail.com");
		
		driver.manage().window().maximize();
		
		By signIn = By.xpath("//a[text()='Sign in']");
		
		By signInBtn = By.xpath("//input[@class='signinbtn']");
		
		//getElement(signIn);
		doClick(signIn);
		doClick(signInBtn);
		
		alert = driver.switchTo().alert();
		System.out.println(alertGetdata());
		alertAccept();
	    
		
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		
		
	}
	

	public static WebElement getElement(By Locator) {
		
		return driver.findElement(Locator);
	}
	
	public static void doClick(By Locator) {
		
		getElement(Locator).click();
	}
	
	public static void alertAccept() {
		
		alert.accept();
	}
	
	public static String alertGetdata() {
		String text = alert.getText();
		return text;
		
	}
	
	public static void alertDismiss() {
		alert.dismiss();
		
	}
}
