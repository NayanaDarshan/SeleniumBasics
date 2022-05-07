package AppLaunch;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitTest {

	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangecrm.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement>  linkslist =driver.findElements(By.tagName("a"));
		
		System.out.println(linkslist.size());
		
		linkslist.stream().forEach(ele -> System.out.println(ele.getText()));
		
		By buyheader= By.xpath("//h2[text()='Orange CRM Pricing']");
		
		/*
		 * for (WebElement Linknames : linkslist) {
		 * 
		 * 
		 * 
		 * System.out.println("The Links are====>" +Linknames.getText());
		 * 
		 * }
		 */
		
		driver.findElement(By.xpath("//a[text()='BUY']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(buyheader));
		
		 Wait<WebDriver> wait1 =new FluentWait<WebDriver>(driver)
		 
		                        .withTimeout(Duration.ofSeconds(10))
		                        .pollingEvery(Duration.ofSeconds(20))
		                        .ignoring(NoSuchElementException.class);
		  wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(buyheader));
		 
		
		
		System.out.println(driver.findElement(buyheader).getSize().getHeight());
		
		System.out.println(driver.findElement(buyheader).getSize().getWidth());
		
		Point p =driver.findElement(buyheader).getLocation();
		
		System.out.println("Attribute===>" +driver.findElement(buyheader).getAttribute("class"));		
		System.out.println(p.getX());
		System.out.println(p.getY());

	
	try {
		throw new Exception("NayanaSmiraExpection");
	}
	
	catch(Exception e) {
		e.printStackTrace();
		e.getMessage();
		
		
	}
	}

	
	
	Wait<WebDriver> wait2 =new FluentWait<WebDriver>(driver)
			
			.withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofSeconds(20))
			.ignoring(NoSuchElementException.class);
			
	
}
