package AppLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionCaps {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangecrm.com/contact-orange-crm.php");
		
		driver.manage().window().maximize();
		
		By fullname = By.xpath("//input[@id='name']");
		
		
		Actions act = new Actions(driver);
		
	   act.keyDown(driver.findElement(fullname), Keys.SHIFT).sendKeys(driver.findElement(fullname), "Nayana MR").build().perform();
	   
	   
		/*
		 * act.keyDown(Keys.CONTROL).sendKeys(Keys.DOWN).build().perform();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		 */

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
//act.clickAndHold(driver.findElement(fullname)).moveToElement(driver.findElement(fullname)).re
		

		driver.findElement(By.xpath("//input[@id='phone']")).click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
