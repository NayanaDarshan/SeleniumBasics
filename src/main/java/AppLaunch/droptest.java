package AppLaunch;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class droptest {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://ksrtc.in/oprs-web/guest/home.do?lange=en");

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		List<WebElement> list = driver.findElements(By.tagName("a"));

		list.addAll(driver.findElements(By.tagName("img")));

		System.out.println(list.size());

		List<WebElement> activeLinks = new ArrayList<WebElement>();

		for (int i = 0; i < list.size(); i++) {

			//System.out.println(list.get(i).getAttribute("href"));

			if (list.get(i).getAttribute("href") != null
					&& !(list.get(i).getAttribute("href").contains("javascript"))) {

				activeLinks.add(list.get(i));
			}

		}
		System.out.println("The Size of active links and images===>" + activeLinks.size());

		for (int j = 0; j < activeLinks.size(); j++) {

			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href"))
					.openConnection();
			connection.connect();

			String response = connection.getResponseMessage();
			
			System.out.println("The links are ===>" + activeLinks.get(j).getAttribute("href") + "===>" + response);

			connection.disconnect();

		//	System.out.println("The links are ===>" + activeLinks.get(j).getAttribute("href") + "===>" + response);

		}
	}

}