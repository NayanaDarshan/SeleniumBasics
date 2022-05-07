package AppLaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableDemo {

	public static WebDriver driver;

	public static JavascriptExecutor js;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to(
				"https://www.espncricinfo.com/series/india-in-australia-2020-21-1223867/australia-vs-india-4th-test-1223872/full-scorecard");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h5[text()='Australia 1st INNINGS ']//ancestor::span")).click();

		By batsMan = By.xpath("(//th[text()='BATSMEN' ])[1]");

		By batsMandata = By.xpath("(//td[@class='batsman-cell text-truncate out'])[2]//following-sibling::td");

		scrollIntoView(batsMan);

		Thread.sleep(2000);
		
		System.out.println(getBowlerdata("Marcus Harris"));
		getBatsmandata();
		
	}

	public static void scrollIntoView(By Locator) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(Locator));

	}

	public static String getBowlerdata(String Name) {
		return driver.findElement(By.xpath(
				"(//a[text()='" + Name + "']//parent::td//following-sibling::td/span[@class='cursor-pointer'])[1]"))
				.getText();

	}
	
	public static void getBatsmandata() {
		
	List<WebElement> details=	driver.findElements(By.xpath(
			"//a[text()='Steven Smith']//parent::td//following-sibling::td"));
	
	for( int i =2; i<details.size();i++) {
		
	 System.out.println(details.get(i).getText());
	}
		 

		
	}

}
