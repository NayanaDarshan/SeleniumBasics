package AppLaunch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionsKeysTest {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();
		/*
		 * Actions act = new Actions(driver);
		 * 
		 * act.sendKeys(Keys.ENTER).perform();
		 * 
		 * System.out.println("enter action performed");
		 * 
		 * act.sendKeys(driver.findElement(By.id("txtUsername")), "Nayana").perform();
		 * 
		 * System.out.println("Enter data performed");
		 */

		WebElement ele = driver.findElement(By.id("txtUsername"));

		Actions act = new Actions(driver);

		act.keyDown(ele, Keys.SHIFT);
		
	    
		act.sendKeys(ele, "Nayana").perform();

		act.keyDown(Keys.CONTROL);

		act.sendKeys("a");

		act.keyUp(Keys.CONTROL);

		act.build().perform();

		act.keyDown(Keys.CONTROL);

		act.sendKeys("c");

		act.keyUp(Keys.CONTROL);

		act.build().perform();

		act.sendKeys(Keys.TAB);
        act.build().perform();
		act.keyDown(Keys.CONTROL);

		act.sendKeys("v");

		act.keyUp(Keys.CONTROL);

		act.build().perform();

//		act.keyUp(ele, Keys.SHIFT);

		
	}

}
