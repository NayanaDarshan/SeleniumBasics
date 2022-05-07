package AppLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownclick {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://book.spicejet.com/search.aspx");
		
		driver.manage().window().maximize();

		By fromLocationTextfield= By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']");
		
		By fromLocationValue = By.xpath("//a[@value='AJL']");
		
		
		driver.findElement(fromLocationTextfield).click();
		
		//fromLocationValuedata(fromLocationValue, "AJL");
		fromLocationValuedata();
	}

	public static void fromLocationValuedata() {
		
		driver.findElement(By.xpath("//a[@value='AJL']")).click();
	}
}