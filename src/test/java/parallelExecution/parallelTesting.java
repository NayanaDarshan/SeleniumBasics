package parallelExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelTesting {
	public static WebDriver driver;

	@Parameters({"browserName"})
	@BeforeClass
	public void setup(String browserName) {

		System.out.println("The Launched browser is:===>" + browserName);

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			driver.get("https://en-gb.facebook.com/");

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}

		else if (browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

			driver.get("https://en-gb.facebook.com/");

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}

	}

	@Test
	public void doLoginTest() {

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nayana.raghu@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
		System.out.println(driver.getTitle());
		driver.navigate().refresh();

	}

	@AfterClass

	public void teardown() {

		driver.quit();
	}

}
