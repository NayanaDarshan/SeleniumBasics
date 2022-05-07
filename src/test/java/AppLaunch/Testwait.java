package AppLaunch;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testwait {
	static WebDriver driver;
	

	public static void main(String[] args) {
		
	    WebDriverManager.chromedriver().setup();
	    
	    driver= new ChromeDriver();
	    
	    driver.get("https://github.com/");
	    
	    driver.manage().window().maximize();
	    
	    By signIn= By.xpath("//a[contains(text(),' Sign in')]");
	    
	    By username=By.xpath("//form//input[@id='login_field']");

	    
	    driver.findElement(signIn).click();
	    
	   
	    
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    
	   WebElement userdata= wait.until(ExpectedConditions.presenceOfElementLocated(username));
	
	   
	   Alert alert =wait.until(ExpectedConditions.alertIsPresent());
	   
	   
	   
	   
	   Wait <WebDriver>wait1 =new FluentWait<WebDriver>(driver)
	   
	                         .withTimeout(Duration.ofSeconds(10))
	                        .pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
	                     
	   
	   userdata.sendKeys("NayanaRaghu");
	   
	   
	   
	
	    
	   
	    
	    	}

}
