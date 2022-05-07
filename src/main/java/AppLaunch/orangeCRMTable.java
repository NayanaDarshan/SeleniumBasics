package AppLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangeCRMTable {
	
	
   public static WebDriver driver;
   
   public static String appURL= "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get(appURL);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		String name =driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		System.out.println(name);
		
		
	
	}

}
