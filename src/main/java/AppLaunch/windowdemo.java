package AppLaunch;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowdemo {

	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://ksrtc.in/oprs-web/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		By trackBusLink = By.xpath("//p[text()='Track Your Bus']");

		windowdemo wdemo = new windowdemo();

		wdemo.doClick(trackBusLink);
		
		Set<String> windows =driver.getWindowHandles();
	
		/*
		 * List<String> windowids = new ArrayList<String>(windows);
		 * 
		 * windowids.stream().forEach(ele-> System.out.println(ele));
		 */
		
		java.util.Iterator<String> it =windows.iterator();
		
		String Pid =it.next();
		String Cid=it.next();
		
		System.out.println(Pid);
		System.out.println(Cid);
		
		driver.switchTo().window(Cid);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		
		

	}

	public void doClick(By Locator) {
		driver.findElement(Locator).click();
	}

}
