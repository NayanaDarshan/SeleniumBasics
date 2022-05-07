package AppLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLCertificate {

	public static WebDriver driver;
	
	public static void main(String[] args) {
	
        WebDriverManager.chromedriver().setup();
        
   
        
        ChromeOptions co = new ChromeOptions();
        
        co.setAcceptInsecureCerts(true);
        
        driver= new ChromeDriver(co);
        
        driver.get("https://self-signed.badssl.com/");
        
        driver.manage().window().maximize();
        
        System.out.println(driver.getTitle());
        
        
	}

}
