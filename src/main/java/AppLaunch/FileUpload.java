package AppLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://gofile.io/uploadFiles");
		
		driver.manage().window().maximize();
		
		WebElement upload = driver.findElement(By.xpath("//button[@id='btnChooseFiles']"));
		
		upload.sendKeys("C:\\Users\\nayana.raghu\\.android ");


	}

}
