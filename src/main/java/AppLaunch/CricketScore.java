package AppLaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScore {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.navigate().to(
				"https://www.espncricinfo.com/series/8674/scorecard/1202251/west-indies-women-vs-india-women-3rd-odi-icc-womens-championship-2017-18-2021");

		WebElement table = driver.findElement(By.xpath("//h5[contains(text(), 'West Indies')]"));

		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("arguments[0].scrollIntoView(true);", table);

		getScoreDetails("CN Nation");

	}

	public static List<WebElement> getScoreDetails(String playerName) {

		List<WebElement> ar = driver
				.findElements(By.xpath("//a[text()='" + playerName +"']//parent::td//following-sibling::td"));

		for (int i = 1; i < ar.size(); i++) {

			System.out.println("The score details are ==> " + ar.get(i).getText());
		}

		return ar;
	}
}
