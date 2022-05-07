package AppLaunch;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class imageclip {

	static WebDriver driver;
	
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		WebElement loginPanel= driver.findElement(By.xpath("//div[@id='logInPanelHeading']"));
		
		int x = loginPanel.getLocation().getX();
		
		int y =loginPanel.getLocation().getY();
		
		int height =loginPanel.getSize().getHeight();
		
		int width =loginPanel.getSize().getWidth();
		
		try {
			BufferedImage image = ImageIO.read(file);
			
			BufferedImage dest = image.getSubimage(x, y, width, height);
			
			
			ImageIO.write(dest, "png", file);
			
			File dest1 = new File("Panel.png");
			
			FileUtils.copyFile(file, dest1);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
