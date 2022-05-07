package LearnSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class proxyTest {

	public static void main(String[] args) {
		
		Proxy proxy = new Proxy();
		
		proxy.setAutodetect(false);
		proxy.setSslProxy("localhost:8080");
		
		
		ChromeOptions co = new ChromeOptions();
		co.setCapability("proxy", proxy);
		
		co.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver(co);
	
	
		
		
		driver.manage().window().setSize(new Dimension(600,700));
		
		
		driver.get("http://google.com");
		
		driver.switchTo().activeElement().getAttribute("title");
		
	}

}
