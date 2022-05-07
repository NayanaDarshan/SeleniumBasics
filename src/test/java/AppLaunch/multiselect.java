package AppLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiselect {
	
	public static WebDriver driver;

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
		
		driver.manage().window().maximize();
		
		By example = By.xpath("//h2[text()='Multiselect with label']");
		
		By multiSelectbox= By.xpath("//input[@class='form-control select-input focused']");
		
		By listbox= By.cssSelector("form-control select-input placeholder-active");
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(example));		
		
		
		driver.findElement(multiSelectbox).click();
	}

}
