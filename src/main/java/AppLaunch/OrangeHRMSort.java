package AppLaunch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMSort {

	public static WebDriver driver;
	
	public static String appURL="https://opensource-demo.orangehrmlive.com/";
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get(appURL);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		By userName= By.xpath("//input[@id='txtUsername']");
		
		By passWord= By.id("txtPassword");
		
		By LoginBtn= By.id("btnLogin");
		
		By AdminLink= By.xpath("//a[@id='menu_admin_viewAdminModule']");
		
		By userManagementLink= By.xpath("//a[@id='menu_admin_UserManagement']");
		
		By usersLink= By.xpath("//a[@id='menu_admin_viewSystemUsers']");
		
		By userRoleOptions= By.xpath("//select[@id='searchSystemUser_userType']");
		
		
		
		enterTextdata(userName, "Admin");
		
		enterTextdata(passWord, "admin123");
		
		doClick(LoginBtn);
		
		moveToElement(AdminLink);
		
		moveToElement(userManagementLink);
		
		doClick(usersLink);
		
		Select userRoledrpdown= new Select(driver.findElement(userRoleOptions));
		
		List<String> userRoledata = new ArrayList<String>();
		
		List<WebElement> options =userRoledrpdown.getOptions();
		
		for ( WebElement userRolenames : options) {
			
			String value =userRolenames.getText();
			
			userRoledata.add(value);
			
			
		}
		System.out.println("Actual list:===>" +userRoledata);
		
		List<String> temp = new ArrayList<String>();
		temp.addAll(userRoledata);
		
		Collections.sort(temp, Collections.reverseOrder());
		
		System.out.println("Expceted list:====>" +temp);
		
		
		
		
		
		

	}
	
	public static void enterTextdata(By Locator, String value) {
		driver.findElement(Locator).sendKeys(value);
	}
	
	
   public static void doClick(By Locator) {
	   driver.findElement(Locator).click();
   }
   
   public static void moveToElement(By Locator) {
	   Actions act = new Actions(driver);
	   
	   act.moveToElement(driver.findElement(Locator)).perform();
	   
   }
}
