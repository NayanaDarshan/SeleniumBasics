package AppLaunch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetTest {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		By spiceStyle =By.xpath("//span[text()='Covid-19 Information']//parent::a");
		

		doClick(spiceStyle);
		System.out.println("The title is ==>"+ driver.getTitle());
		
		//String windowNames =getWindowID();
		
		//System.out.println(windowNames);
		
		
	Set<String>handles =driver.getWindowHandles();
	
	Iterator<String> it= handles.iterator();
	
	String pwindow= it.next();
	System.out.println(pwindow);
	String cwindow=it.next();
	System.out.println(cwindow);
	driver.switchTo().window(pwindow);
    System.out.println("The user is in parent window now!!!!");
	
		
	}
	
	public static void doClick(By Locator) {
	driver.findElement(Locator)	.click();
		
	}

	public static String getWindowID() {
		
    int i;
	Set<String>handles=	driver.getWindowHandles();

	List<String> windows = new ArrayList<String>(handles);
	
	System.out.println(windows.size());
	
    for ( i =0; i< windows.size(); i++) {
    	 System.out.println("The window id's are ==>" +windows.get(i));	 
	}
	return windows.get(i);
	
    
	}
}
