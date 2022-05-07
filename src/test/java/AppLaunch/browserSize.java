package AppLaunch;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserSize {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriverManager.chromedriver().setup();

		//ChromeOptions co = new ChromeOptions();

		//co.setAcceptInsecureCerts(true);
		
		//co.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
	
	
	
		//co.addArguments("--incognito");

		//co.addArguments("--headless");

		driver = new ChromeDriver();

		driver.get("https://gmail.com");

		driver.manage().window().maximize();
		
		WebElement email =driver.findElement(By.xpath("//input[@type='email']"));
	    boolean status =email.isEnabled();
	    
	    System.out.println(status);
		
	    WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
	    
	   String nextButton=  nextBtn.getText();
	    Thread.sleep(1000);
	    
	    email.click();
	    
	    Thread.sleep(1000);
	    
		//email.sendKeys("nayana.raghu@epicor.com");
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.SHIFT).sendKeys(email, "nayana.raghu@epicor.com").keyUp(Keys.SHIFT).build().perform();
		
		act.contextClick(email).perform();
		
		
		
		String tagname =email.getTagName();
		
		System.out.println(tagname);
		
		String attribute= email.getAttribute("type");
		
		System.out.println(attribute);
		
		String cssvalue = email.getCssValue("nextButton");
	
		System.out.println(cssvalue);
		
	   Dimension d= nextBtn.getSize();
	   
	   System.out.println(d.getHeight());
	   System.out.println(d.getWidth());
	   
	   org.openqa.selenium.Point p =nextBtn.getLocation();
	   
	   System.out.println(p.x);
	   
	   System.out.println(p.y);
	   
	   Robot robot= new Robot();
	   
	   robot.keyPress(KeyEvent.VK_SHIFT);
	   
	}
	
}