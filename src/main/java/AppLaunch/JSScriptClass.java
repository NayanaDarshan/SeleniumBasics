package AppLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSScriptClass {

	static WebDriver driver;

	static JavascriptExecutor js;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://amazon.com");

		driver.manage().window().maximize();

		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * 
		 * String title =js.executeScript("return document.title;").toString();
		 * 
		 * System.out.println(title)
		 */;

		System.out.println(jsGetTitle());


		//System.out.println(jsGetPageInnerText());
		//refershBrowserByJS();
		
		scrollPageDown();
		
		Thread.sleep(1000);
		
		scrollPageUp();
		
		Thread.sleep(1000);
		
		System.out.println(getBrowserInfo());
		
		WebElement beauty =driver.findElement(By.xpath("//span[contains(text(),'Top Beauty')]//parent::h2[@class='as-title-block-left']"));
		Thread.sleep(1000);
		
		scrollIntoView(beauty);
		
		//JSchangeColor("Red", beauty);
		
		JSdrawBorder(beauty);
	}

	public static String jsGetTitle() {
		js = (JavascriptExecutor) driver;

		return js.executeScript("return document.title ;").toString();

	}

	public static String jsGetPageInnerText() {

		js = (JavascriptExecutor) driver;
		return js.executeScript("return document.documentElement.innerText;").toString();

	}
	
	public static void refershBrowserByJS() {
		
		js = (JavascriptExecutor) driver;
		js.executeScript("history.go[0]");
	}
	
	public static void scrollPageDown() {
		
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollPageUp() {
		
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	}
	
	public static void scrollIntoView(WebElement element) {
		
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
	
	public static String getBrowserInfo() {
		
		js = (JavascriptExecutor)driver;
		
		return js.executeScript("return navigator.userAgent;").toString();
		
	}
	
	public static void JSchangeColor(String color, WebElement element) {
		
		js= (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
	}
	
	public static void JSdrawBorder(WebElement element) {
		
		js= (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].style.border = '3px solid red'",element);
		
	}
	
	public void sendKeysUsingJSWithId(String id, String value) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("document.getElementById('" + id + "').value='" + value + "'");
	}

	public void sendKeysUsingJSWithName(String name, String value) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("document.getElementByName('" + name + "').value='" + value + "'");
	}
	
}
