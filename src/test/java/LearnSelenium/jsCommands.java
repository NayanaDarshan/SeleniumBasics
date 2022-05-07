package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jsCommands {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.freshworks.com/crm/solutions/free/?tactic_id=4415999&utm_source=Google-Adwords&utm_campaign=Fsales-Search-IND-DSA&utm_term=&device=c&utm_medium=Fsales-Search-IND-DSA&gclid=Cj0KCQjw--GFBhDeARIsACH_kdbY2XLiI-WDnrwFftL2vUtt5PFLEmB_KbYAts_h1hXW72RKqmHp81waAiSqEALw_wcB");
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);

	    
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    
	//   js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		
		//System.out.println(js.executeScript("return document.title;").toString());

	//	WebElement header = driver.findElement(By.xpath("//h2[text()='Freshworks CRM, the best free CRM']"));
		
	//	WebElement loginBtn= driver.findElement(By.xpath("//a[text()='Login']"));
		//js.executeScript("history.get(0)");
		
	  //   js.executeScript("alert('This is Nayana message')");
		
		//WebElement userName= driver.findElement(By.xpath("//input[@name='domain-fwcrm-login']"));
		
		//System.out.println(js.executeScript("return document.documentElement.innerText;").toString());
		
		//js.executeScript("arguments[0].scrollIntoView(true)", header);
		
		//js.executeScript("arguments[0].style.border= '3px solid red'", header);
		
	//	js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	
		//js.executeScript("arguments[0].click();", loginBtn);
		
	
		
				//	js.executeScript("document.getElementById('userName').value('Nayana')");

	}
}
