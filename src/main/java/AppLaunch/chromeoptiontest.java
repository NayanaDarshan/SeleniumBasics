package AppLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromeoptiontest {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
  ChromeOptions co= new ChromeOptions();
		
	co.setAcceptInsecureCerts(true);
	

		
	
		//DesiredCapabilities ds = new DesiredCapabilities();
		
		//ds.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, "true");
		
		driver= new  ChromeDriver(co);


		driver.get("https://expired.badssl.com/");
		
		
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		//driver.quit();
		
		

	}

}
