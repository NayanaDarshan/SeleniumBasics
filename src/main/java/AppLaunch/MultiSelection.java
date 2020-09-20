package AppLaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelection {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");

		driver = new ChromeDriver(co);

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();

		Thread.sleep(1000);

		By optionList = By.xpath("//span[@class='comboTreeItemTitle']");

		//choiceSelect(optionList, "choice 2", "choice 2 3", "choice 6 2", "choice 7" );

		choiceSelect(optionList, "all");

	}

	public static void choiceSelect(By Locator, String... value) {
		List<WebElement> optionList = driver.findElements(Locator);

		System.out.println(optionList.size());
		
		if( !value[0].equals("all")) {

		for (int i = 0; i < optionList.size(); i++) {

			String text = optionList.get(i).getText();
			System.out.println(optionList.get(i).getText());

			for (int j = 0; j < value.length; j++) {
				if (text.equalsIgnoreCase(value[j])) {
					optionList.get(i).click();
					break;

				}

			}

		}
		
			
		}
		else {
			try {
				for( int all=0; all<optionList.size(); all++) {
					
					optionList.get(all).click();
				}
			}catch( Exception e)	{
	
				
			}
				
			}
			
			
			
		}
	}



//