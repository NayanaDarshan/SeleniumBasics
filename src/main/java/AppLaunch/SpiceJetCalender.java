package AppLaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetCalender {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.espncricinfo.com/ci/content/player/country.html?country=2");

		driver.manage().window().maximize();
		
		By playersList=By.xpath("//div[@id='rectPlyr_Playerlisttest']//tbody/tr/td/a");
		
		By tableheader=By.xpath("//div[@class='tabHldr']//ul/li");
		
		
		/*
		 * By deptDate = By.xpath("//input[@id='ctl00_mainContent_view_date1']");
		 * 
		 * By dates = By.
		 * xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//table//tbody//tr//td"
		 * );
		 * 
		 * By Addons= By.xpath("//a[text()='Add-Ons']");
		 * 
		 * By AddonsSubLink
		 * =By.xpath("//div[@id='smoothmenu1']//ul[@class='add-ons-tab']//li");
		 * 
		 * Actions act = new Actions(driver);
		 * act.moveToElement(driver.findElement(Addons)).perform();
		 * 
		 * 
		 * doClick(deptDate); System.out.println("The calender icon is clicked");
		 * 
		 * getElementList(dates, "26");
		 * 
		 * 
		 * getElementList(AddonsSubLink, "SpiceAssurance");
		 */
		getElementList(tableheader, "Tests");
		
		getElementList(playersList, "JM Bird");
		
		System.out.println(driver.getTitle());
		
	}

	public static void doClick(By Locator) {

		// driver.findElement(Locator).click();

		/*
		 * Actions act = new Actions(driver);
		 * 
		 * act.click(driver.findElement(Locator));
		 */

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", driver.findElement(Locator));
	}

	public static void getElementList(By Locator, String value) {

		List<WebElement> list = driver.findElements(Locator);

		for (int i = 0; i < list.size(); i++) {

			String dateText = list.get(i).getText();

			if (dateText.equalsIgnoreCase(value)) {
				list.get(i).click();
				break;
			}

		}

	}

}
