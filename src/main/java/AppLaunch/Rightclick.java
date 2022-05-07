package AppLaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rightclick {

	static WebDriver driver;

	static List<WebElement> optionList;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		driver.manage().window().maximize();

		WebElement rightClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		optionList = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//li[contains(@class, 'context-menu-icon')]"));
		
		rightClick(rightClick);

		optionList.stream().forEach(optionName -> System.out.println(optionName.getText()));
		optionNameClick(optionList, "Edit");
		


	}
	
	public static void rightClick(WebElement ele) {
		
		Actions act = new Actions(driver);
		
		act.contextClick(ele).perform();
		
		
	}

	public static void optionNameClick(List<WebElement> optName, String value) {
		

		System.out.println(optName.size());

		for (int i = 0; i < optName.size(); i++) {

			System.out.println("The option names are===>" + optionList.get(i).getText());
			String text = optName.get(i).getText();

			if (text.equalsIgnoreCase(value)) {

				optName.get(i).click();
				break;
			}
		}

	}

}
