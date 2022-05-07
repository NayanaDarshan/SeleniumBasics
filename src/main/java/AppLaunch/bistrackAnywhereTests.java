package AppLaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bistrackAnywhereTests {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://warr-qa-bt39.solarsoft.local:8140/BisTrackAnywhere/Notepad/Default");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='ctl00_MainContentPlaceHolder_UserNameInput']"))
				.sendKeys("Nayana.emp06");

		driver.findElement(By.xpath("//input[@id='ctl00_MainContentPlaceHolder_PasswordInput'] ")).sendKeys("123");

		driver.findElement(By.xpath("//input[@id='ctl00_MainContentPlaceHolder_SignInButton_input']")).click();

		driver.navigate().to("http://warr-qa-bt39.solarsoft.local:8140/BisTrackAnywhere/Notepads.aspx");

		System.out.println(driver.getTitle());

		driver.findElement(By
				.xpath("//input[@id='ctl00_ctl00_ctl00_HeaderContentPlaceHolder_BannerContentPlaceHolder_AddButton']"))
				.click();

		WebElement Type = driver.findElement(By.xpath(
				"//select[@id='ctl00_ctl00_ctl00_MainContentPlaceHolder_MainContentPlaceHolder_MainContentPlaceHolder_NotepadTypeDropDownList']"));

		Type.click();

		Select sel = new Select(Type);

		List<WebElement> typeDetails = sel.getOptions();

		System.out.println(typeDetails.size());

		System.out.println(sel.getFirstSelectedOption().getText());

		sel.selectByVisibleText("Managment Call-db");

		// * for (int i=0; i< typeDetails.size(); i++) {
		/*
		 * * if( typeDetails.get(i).getText().equalsIgnoreCase("Managment Call-db")) {
		 * typeDetails.get(i).click(); break; } }
		 */
//		typeDetails.stream().forEach(ele-> System.out.println(ele.getText()));
		// */

	}

}
