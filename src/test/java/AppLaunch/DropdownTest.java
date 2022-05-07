package AppLaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTest {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();

		By drpField = By.id("justAnInputBox");

		By drpvalues = By.xpath("//span[@class='comboTreeItemTitle']");

		Thread.sleep(2000);

		driver.findElement(drpField).click();

		Thread.sleep(3000);
		
		dropValueSelect(drpvalues, "choice 1");

		// dropValueSelect(drpvalues, "choice 1", "choice 2","choice 5", "choice 6 1");

		//dropValueSelect(drpvalues, "all");

	}

	public static void dropValueSelect(By Locator, String... value) {

		List<WebElement> choice = driver.findElements(Locator);

		if (!(value[0].equals("all"))) {

			for (int i = 0; i < choice.size(); i++) {
				String text = choice.get(i).getText();

				// System.out.println("The drop down values are ===>"+ text);

				for (int j = 0; j < value.length; j++) {

					if (text.equalsIgnoreCase(value[j])) {
						choice.get(i).click();
						System.out.println("The drop down values are clicked");
						break;

					}

				}
			}

		}

		else {

			for (int all = 0; all < choice.size(); all++) {

				try {
					choice.get(all).click();
				} catch (Exception e) {
					// System.out.println(e.getMessage());
				}

			}
		}
	}

}
