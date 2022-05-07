package AppLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class options {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--headless");
		
	//	co.setAcceptInsecureCerts(acceptInsecureCerts)
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
		
		System.out.println("execution completed");

	}

}
