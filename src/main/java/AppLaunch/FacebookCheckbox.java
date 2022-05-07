package AppLaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookCheckbox {

	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/r.php");

		driver.manage().window().maximize();

		By genderRadio = By.xpath("//input[@name='sex']//parent::span");

		radioClick(genderRadio, "Female");

	}

	public static void radioClick(By Locator, String value1) {
		List<WebElement> gendertype = driver.findElements(Locator);

		for (int i = 0; i < gendertype.size(); i++) {

			String value = gendertype.get(i).getText();

			System.out.println("The values are===>" + value);

			if (value.equalsIgnoreCase(value1)) {

				gendertype.get(i).click();
				break;
			}
		}
	}
}
