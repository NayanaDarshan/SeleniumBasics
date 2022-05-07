package AppLaunch;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.util.Duration;

public class brokenLinksTest {

	static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
	    List<WebElement> linknames=  driver.findElements(By.tagName("a"));
	    
	    System.out.println(linknames.size());
	    
	    List< String> linkdata = new ArrayList<String>();
	    
	    for(WebElement link: linknames) {
	    	
	    	System.out.println(link.getText());
	    	
	    	String url= link.getAttribute("href");
	    	
	    	if(url!=null) {
	    	linkdata.add(url);
	    	System.out.println(linkdata);
	    	}
	    	//getBrokenLinkList(url);
	    	
	    	//linkdata.parallelStream().forEach(e ->getBrokenLinkList(e));
	    }
	}
	
	public static void getBrokenLinkList(String url) {
		
		try {
			URL url1 = new URL(url);
			
			HttpURLConnection httpconnection =(HttpURLConnection) url1.openConnection();
			
			httpconnection.setConnectTimeout(5000);
			
			if(httpconnection.getResponseCode()>=400) {
				
				System.out.println("The link===>" +url +httpconnection.getResponseMessage() +"given link is broken");
			}
			else {
				System.out.println("The link===>" +url +httpconnection.getResponseMessage());
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
