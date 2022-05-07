package AppLaunch;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMScreenshot {

	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Contact Sales']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='Form_submitForm_FirstName']")).sendKeys("Nayana Smira");
		
		TakesScreenshot ts= ((TakesScreenshot)driver);
		
		File source =ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("./SeleniumBasics/src/main/java/Screenshots/screenshot.png"));
		
		System.out.println("The screenshot is captured");
		
		SimpleDateFormat dateformat = new SimpleDateFormat("MM/DD/YYYY HH:mm:ss");
		
		Date date1= new Date();
		
		String date= dateformat.format(date1);
		
		System.out.println("The current date is===>" +date);
		
		
		
	}

}
