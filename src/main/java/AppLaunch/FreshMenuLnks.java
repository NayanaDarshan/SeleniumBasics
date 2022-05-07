package AppLaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreshMenuLnks {
	static WebDriver driver;
	static List<WebElement> linkdetails;
	static String browser ="chrome";
	static String AppURL= "http://freshworks.com";

	public static void main(String[] args) {
		
		
		BrowserUtil br = new BrowserUtil();
		driver= br.browserLaunch(browser);
		br.getURL(AppURL);
	    System.out.println(br.getCurrentUrl());
	    System.out.println(br.getTitleName());
		
		
		ElementUtil Obj = new ElementUtil(driver);


	     By linkTag = By.xpath("//div[@class='footer-main']//a");
	
		
		  Obj.linkCount(linkTag); 
		  Obj.getlinkCount(linkTag); 
		  Obj.getLinkNames(linkTag);
		  Obj.getLinkAttribute(linkTag);

		  
	}


	}
	


