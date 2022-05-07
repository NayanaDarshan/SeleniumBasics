package Generics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filewriting {

	public static void main(String[] args) {
		
		File file= new File("C:\\Gatling\\abc.txt");
		
		System.out.println("File Created");
		try {
			FileWriter f = new FileWriter(file);
			
			BufferedWriter bf = new BufferedWriter(f);
			
			bf.write("Nayana");
			
			bf.newLine();
			
			bf.write("Smira");
			
			bf.close();
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
