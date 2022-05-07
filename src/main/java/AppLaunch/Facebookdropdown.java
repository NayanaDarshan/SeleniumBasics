package AppLaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookdropdown {

	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
		
		Select dayvalue= new Select(day);
		
		driver.manage().window().maximize();
		
	    WebElement Before_value = dayvalue.getFirstSelectedOption();
	    System.out.println("Before value ===>" +Before_value.getText());
	    
	    dayvalue.selectByIndex(3);
	   
	    Thread.sleep(1000);
	    
	    dayvalue.selectByValue("18");
	    
	    Thread.sleep(1000);
	    
	    dayvalue.selectByVisibleText("27");
	    
	    
	    WebElement after_value=dayvalue.getFirstSelectedOption();
	    
	    
	    System.out.println("After value===>" +after_value);
	    
	    
	    List<WebElement> alldayvalue =dayvalue.getOptions();
	    
	    for ( WebElement allvalue : alldayvalue) {
	    	System.out.println("The all values are===>" + allvalue.getText());
	    }
	    
	    
	    
		

	}

}
