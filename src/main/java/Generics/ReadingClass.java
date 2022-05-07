package Generics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingClass {

	public static void main(String[] args) {
		
		File file = new File("C:\\Gatling\\abc.txt");
		
		try {
			FileReader fd= new FileReader(file);
			
			BufferedReader bf = new BufferedReader(fd);
			
			String line=null;
			
			while((line=bf.readLine())!= null) {
			
			System.out.println(line);
			
			}
			
			bf.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
