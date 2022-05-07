package Generics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoSearch {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		WebDriverManager.chromedriver().setup();

		driver.get("https://google.com");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("tools");
		
		Dimension d =driver.findElement(By.xpath("")).getSize();
		
		System.out.println(d.getWidth());
		System.out.println(d.getHeight());
		
		Point p=driver.findElement(By.xpath("")).getLocation();
		
		System.out.println(p.x);
		
		

		Thread.sleep(2000);
		List<WebElement> searchList = driver.findElements(
				By.xpath("//div[@class='aajZCb']//div[@class='OBMEnb']//div[contains(@class, 'wM6W7d')]/span"));

		System.out.println(searchList.size());

		for (WebElement searchoption : searchList) {

			String searchoptionName = searchoption.getText();

			System.out.println(searchoptionName);
			
			  if (searchoptionName.equalsIgnoreCase("tools kit")) {
			  
			  searchoption.click(); break; }
			 
		}

		// searchList.stream().forEach(ele -> System.out.println(ele.getText()));
		
	     
	

	}

	public static WebElement waitwithfluent(By locator, int timeout, int interval) {
		
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				          .withTimeout(Duration.ofSeconds(timeout))
				          .pollingEvery(Duration.ofSeconds(interval))
				          .ignoring(NoSuchElementException.class);
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
				          
				          
		
		
		
	}
}
