

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenLinksTest {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> LinkList =driver.findElements(By.tagName("a"));
		
		System.out.println(LinkList.size());
		
		for(int i=0; i<LinkList.size(); i++) {
			
			System.out.println("The Linknames are===>" +LinkList.get(i).getText());
			
			
			String url =LinkList.get(i).getAttribute("href");
			
			
			verifyLinkURL(url);   
			
		}
		
			

	}
	
	public static void verifyLinkURL(String LinkURL) {
		
		try {
			URL url = new URL(LinkURL);
			
			HttpURLConnection httpurlconnect = (HttpURLConnection)url.openConnection();
			httpurlconnect.connect();
			
			httpurlconnect.setConnectTimeout(5000);
			
			if(httpurlconnect.getResponseCode()>=400) {
				
				System.out.println(LinkURL+ "====>" + httpurlconnect.getResponseMessage() +"Link is broken");
				
			} else {
				System.out.println(LinkURL +"===>" + httpurlconnect.getResponseMessage());
			}
			
			
			httpurlconnect.disconnect();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
