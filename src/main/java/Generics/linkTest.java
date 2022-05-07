package Generics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linkTest {

	public static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException, IOException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.freshworks.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		links.addAll(driver.findElements(By.tagName("img")));

		System.out.println("Total Links===>" + links.size());

		List<WebElement> activeLinks = new ArrayList<WebElement>();

		for (int i = 0; i < links.size(); i++) {

			if (links.get(i).getAttribute("href") != null) {
				activeLinks.add(links.get(i));
			}

		}

		System.out.println(" Active Links====>" + activeLinks.size());
	
		for (int j = 0; j < activeLinks.size(); j++) {

			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href"))
					.openConnection();

			connection.connect();

			int statuscode = connection.getResponseCode();

			String message = connection.getResponseMessage();
			
			System.out.println(activeLinks.get(j).getAttribute("href").toString());

			System.out.println(statuscode + "  " + message);

			connection.disconnect();

		}
	
	
	}
	
	
}


