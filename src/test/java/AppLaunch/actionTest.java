package AppLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionTest {

	public static WebDriver driver;
	
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		//driver.get("https://login.mailchimp.com/?_ga=2.5474099.1609846892.1619435856-468128082.1619435856&_gac=1.15203652.1619435856.Cj0KCQjwyZmEBhCpARIsALIzmnKwhHU2LEuUoSsQox_9rI9EzI6xem__xdthb9FsgiQjxC4jr4OW7UUaAvPrEALw_wcB");
		
		driver.get("https://login.mailchimp.com/login/forgot-username/");
		
		driver.manage().window().maximize();
		
		
		WebElement radiobtn=driver.findElement(By.xpath("(//input[@name='recover_username'])[1]"));
		
		boolean status =radiobtn.isSelected();
		
		System.out.println(status);
		
		radiobtn.click();
		
		
		
		WebElement emailid= driver.findElement(By.cssSelector("#email"));
		
		System.out.println(emailid.getSize().getHeight());
		
		System.out.println(emailid.getSize().getWidth());
		
		System.out.println(emailid.getAttribute("placeholder"));
		
		
		
		/*
		 * WebElement username =driver.findElement(By.id("username"));
		 * 
		 * username.sendKeys("Nayana");
		 * 
		 * Actions act = new Actions(driver);
		 * 
		 * act.keyDown(Keys.CONTROL); act.sendKeys("a");
		 * act.keyUp(Keys.CONTROL).build().perform();
		 * 
		 * act.keyDown(Keys.CONTROL); act.sendKeys("c");
		 * act.keyUp(Keys.CONTROL).build().perform();
		 * 
		 * 
		 * act.sendKeys(Keys.TAB).build().perform();
		 * 
		 * act.keyDown(Keys.CONTROL); act.sendKeys("v");
		 * act.keyUp(Keys.CONTROL).build().perform();
		 */		
		
		
		
		
		

	}

}
