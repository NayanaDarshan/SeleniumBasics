package LearnSelenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowTest {

	public static WebDriver driver;

	public static String mainWindow;

	public static String windowID = null;

	public static void main(String[] args) {

		/*
		 * WebDriverManager.chromedriver().setup();
		 * 
		 * driver = new ChromeDriver();
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		 * 
		 * By newBrowserWindow = By.xpath("//button[@name='newbrowserwindow123']");
		 * 
		 * mainWindow = driver.getWindowHandle();
		 * 
		 * System.out.println("Main window id's ===>" + mainWindow);
		 * 
		 * doClick(newBrowserWindow); goChildWindow(); tearDown();
		 */
		
		testPrimeNumbers(7);
	}

	/*
	 * Method Name - doClick
	 * 
	 * This method performs click action
	 * return type: void
	 */
	public static void doClick(By Locator) {
		driver.findElement(Locator).click();
	}

	/*
	 * Method Name- getAllWindow
	 * 
	 * This method gives the unique WindowID's
	 *  return type: void
	 */
	public static void getAllWindow() {

		Set<String> allWindows = driver.getWindowHandles();

		Iterator<String> it = allWindows.iterator();

		while (it.hasNext()) {

			windowID = it.next();
			System.out.println("The window id's are ===>" + windowID);

		}

	}

	/*
	 * Method Name- goChildWindow()
	 * 	This method internally calls  getAllWindow() method;
	 *
	 *It navigates to  Child window and gives the title of Child window
	 *return type: void
	 *
	 */
	public static void goChildWindow() {
		getAllWindow();

		if (windowID != mainWindow) {

			driver.switchTo().window(windowID);

			System.out.println(driver.getTitle());

		}

	}
	
	
	public void testWaitflow() {
		
		Wait<WebDriver> wait =new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
      .pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
	}
	
	public static void testPrimeNumbers(int num) {
	int m = num/2;
	int flag=0;
	
	if(num==0) {
		System.out.println("number is not prime");
	}
	else {
		for( int j=2; j<=m; j++) {
			if( num%j==0) {
				System.out.println("The number is not prime" +num);
				flag=1;
				break;
			}
			else {
				System.out.println("The number is  prime" +num);
			}
		}
	}
	}
	/*
	 * Method Name- tearDown
	 * 
	 * It closes the active session of browser
	 * return type: void
	 */

	public static void tearDown() {
		
		driver.close();
		
	}
}
