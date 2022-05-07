package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {
    
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.goindigo.in/");
		
		System.out.println(driver.getTitle());
		
	
		By booktooltip =By.xpath("//a[@title='Book']");
		
		By addontip=By.xpath("//a[text()='6E Add-ons ']");
		
		By roundtripcheckbox= By.xpath("//label[text()='Round Trip']");
		
		
		//System.out.println(verifyTooltiptext(booktooltip));
		//System.out.println(verifyTooltiptext(addontip));
		
		Actions act = new Actions(driver);
		
		//WebElement ele= driver.findElement(booktooltip);
		
		//act.contextClick(ele).perform();
		
		boolean status =driver.findElement(roundtripcheckbox).isSelected();
		
		System.out.println(status);
		
		if(status!=true) {
			driver.findElement(roundtripcheckbox).click();
	
		}
		
		else 
			System.out.println("The status is selected");
		}
		
		//act.moveToElement(ele).perform();
		
		//driver.findElement(By.xpath("//a[text()='About booking online ']")).click();
		
		
	

	public static String verifyTooltiptext(By Locator) {
		
		String tooltiptext=driver.findElement(Locator).getAttribute("title");
		
		return tooltiptext;
		
		
		
	}
	
	
	
	
}
