package AppLaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMDrpDown {
	static WebDriver driver;
	static String AppURL = "http://orangehrm.com";
	static String browser = "chrome";


	public static void main(String[] args) throws InterruptedException {

		BrowserUtil br = new BrowserUtil();
		driver = br.browserLaunch(browser);
		br.getURL(AppURL);

		ElementUtil eu = new ElementUtil(driver);

		// By month = By.name("birthday_month"); selectByText(month, "Nov");

		By freetrail = By.xpath("//a[text()='FREE 30 Day Trial']//parent::li");
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		By empCount = By.id("Form_submitForm_NoOfEmployees");
		eu.doClick(freetrail);

		Thread.sleep(1000);
		
		  eu.selectByIndex(empCount, 3); 
		  eu.selectByValue(industry,"Finance/Banking/Insurance/Real Estate/Legal"); 
		  eu.selectByText(country,"Antigua and Barbuda"); 
		  eu.getAllDropOptions(country);
		  
		  br.browserquit();
		
		//WebElement indus = getElement(industry);
		
		/*
		 * Select sel = new Select(indus);
		 * 
		 * List<WebElement> dropoptions = sel.getOptions();
		 * 
		 * System.out.println(dropoptions.size());
		 * 
		 * dropoptions.stream().forEach(ele -> System.out.println(ele.getText()));
		 */
		
	 
		
	}

}
