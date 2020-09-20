package AppLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrganeHRM {

    static WebDriver driver;
	static String browser = "chrome";
	static String appURL = "https://www.orangehrm.com/";
	
	public static void main(String[] args) throws InterruptedException {
	
		By firstName = By.id("Form_submitForm_FirstName");
		By lastName = By.id("Form_submitForm_LastName");
		By emailID = By.id("Form_submitForm_Email");
		By jobTitle = By.id("Form_submitForm_JobTitle");
		By companyName = By.id("Form_submitForm_CompanyName");
		By phoneNum = By.id("Form_submitForm_Contact");
		By chkBox = By.xpath("//input[@id='Form_submitForm_SetDummyData']");
		By Freetrail = By.className("pulse");
		By URL = By.id("Form_submitForm_subdomain");
		By Accpt_Cookies= By.xpath("//a[text()='Accept Cookies']");
		BrowserUtil br = new BrowserUtil();
		
	
		
		driver =br.browserLaunch(browser);
		br.getURL(appURL);
		driver.manage().window().maximize();
		String currentTitle= br.getCurrentUrl();
		System.out.println("The Orange CRM Title is ==>" +currentTitle);
		String pageTitle= br.getTitleName();
		System.out.println("The Organe CRM Page Title===>" +pageTitle);
		ElementUtil Obj = new ElementUtil(driver);

		// By accptCookies = By.className("accept-cookies-button");
		
		Obj.doClick(Freetrail);
		/*
		 * WebElement accptCookies=
		 * driver.findElement(By.xpath("//a[text()='Accept Cookies']"));
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor)driver;
		 * js.executeAsyncScript("arguments[0].click()", accptCookies);
		 * 
		 */
		
		Obj.actClick(driver.findElement(Accpt_Cookies));
		
		waitElement(URL, 3000);
		Obj.enterText(URL, "https://envrway.com");
		Obj.enterText(firstName, "NayanaMR");
		Obj.enterText(lastName, "Darshan");
		Obj.enterText(emailID, "envrway@gmail.com");
		Obj.enterText(jobTitle, "MD");
		Obj.enterText(companyName, "ENV R WAY");
		Obj.enterText(phoneNum, "9886915240");
		Obj.doClick(chkBox);
		System.out.println("Entering the data to the Fields is completed");
		br.browserquit();
	}
     
	public static void waitElement( By Locator, int timeout) {
	WebDriverWait wait = new WebDriverWait(driver, timeout);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locator)));
	
	}
}
