package AppLaunch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopupsHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://www.popuptest.com/goodpopups.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		By popLink1 = By.xpath("//a[text()='Good PopUp #1']");
		By popLink2 = By.xpath("//a[text()='Good PopUp #2']");

		doClick(popLink1);

	    doClick(popLink2);

		switchWindow();

	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}

	public static void doClick(By Locator) {
		getElement(Locator).click();
	}

	public static List<String> getParentWindowID() {

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> It = handles.iterator();

		String pID = It.next();
		String c1ID = It.next();
		String c2ID = It.next();

		System.out.println("Parent window ID:==> " + pID);
		System.out.println("Child window ID1:==>" + c1ID);
		System.out.println("Child window ID2:==>" + c2ID);
		List<String> ar = new ArrayList<String>();

		ar.add(pID);

		ar.add(c1ID);
		
		ar.add(c2ID);

		return ar;

	}

	public static void switchWindow() throws InterruptedException {

		List<String> ar = getParentWindowID();

		driver.switchTo().window(ar.get(1));

		System.out.println(driver.getTitle());

		driver.close();
		
		driver.switchTo().window(ar.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		
		
		driver.switchTo().window(ar.get(0));
		System.out.println(driver.getTitle());
		driver.close();
		
		

	}

}