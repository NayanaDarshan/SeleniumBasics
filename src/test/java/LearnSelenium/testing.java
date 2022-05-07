package LearnSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class testing extends abstractFlow {

	public static void main(String[] args) {
		
		testing obj= new testing();
		
		int arr[] = new int[3];
		
		System.out.println();
		
		System.out.println(arr.length);
		
	
	
		int arr1[] = {10,20,30};
		
		
		try {
			FileInputStream ip = new FileInputStream("./src/test/java/LearnSelenium/config.properties");
			Properties prop = new Properties();
			
			prop.load(ip);
			System.out.println(prop.getProperty("name"));
			
			prop.setProperty("name", "Smira");
			
			System.out.println(prop.getProperty("name"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	}
	
	public testing() {
		super();
		System.out.println("Child class constructor");
	}

	@Override
	public void testMethod1() {
		// TODO Auto-generated method stub
		
	}

}
