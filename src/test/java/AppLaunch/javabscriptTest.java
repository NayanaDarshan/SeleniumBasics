package AppLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javabscriptTest {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
		WebElement ele = driver.findElement(By.xpath(""));
		
		JavascriptExecutor js =   ((JavascriptExecutor) driver);
		
		js.executeScript("arguments[0].click();", ele);
		
		js.executeScript("history.go(0)");
		
		js.executeScript("window.scrollTo(0, document.body.scrollheight)");
		
		js.executeScript("window.scrollTo(document.body.scrollheight", 0);
		
		js.executeScript("window.scrollIntoView(true);", ele);
		
		js.executeScript("return document.title;").toString();
		
		
		js.executeScript("document.getElementById('"+name+"').value='"+value+"'");
	
		

	}

}
