package Generics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testMaxMinWindow {
	
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://google.com");
		
         Dimension d = new Dimension(300, 1080);
         
         System.out.println(d.getHeight());
         
         System.out.println(d.getWidth());
         
         driver.manage().window().setSize(d);
         
         driver.manage().window().maximize();
         
         Thread.sleep(1000);
        
         Point p = new Point(0, 100);
         
         System.out.println(p.getX());
         System.out.println(p.getY());
         
         driver.manage().window().setPosition(p);
         
         driver.quit();
         
   
		
	}

}
