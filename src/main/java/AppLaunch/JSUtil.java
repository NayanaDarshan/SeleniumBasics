package AppLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSUtil {

	static WebDriver driver;
	static JavascriptExecutor js;

	public JSUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(String element) {

		return driver.findElement(By.xpath(element));
	}

	public void JSElementClick(WebElement element) {

		js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", element);

	}

	public String jsGetTitle() {
		js = (JavascriptExecutor) driver;

		return js.executeScript("return document.title ;").toString();

	}

	public String jsGetPageInnerText() {

		js = (JavascriptExecutor) driver;
		return js.executeScript("return document.documentElement.innerText;").toString();

	}

	public void refershBrowserByJS() {

		js = (JavascriptExecutor) driver;
		js.executeScript("history.go[0]");
	}

	public void scrollPageDown() {

		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public void scrollPageUp() {

		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	}

	public void scrollIntoView(WebElement element) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}

	public String getBrowserInfo() {

		js = (JavascriptExecutor) driver;

		return js.executeScript("return navigator.userAgent;").toString();

	}

	public void JSchangeColor(String color, WebElement element) {

		js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
	}

	public void JSdrawBorder(WebElement element) {

		js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].style.border = '3px solid red'", element);

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
