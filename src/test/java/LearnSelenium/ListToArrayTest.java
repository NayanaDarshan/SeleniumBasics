package LearnSelenium;

import java.util.ArrayList;
import java.util.Arrays;

public class ListToArrayTest {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("Nayana", "Darshan", "Smira", "Smaya"));

		String ar1[] = new String[ar.size()];

		ar.toArray(ar1);

		// System.out.println(ar1.toString());

		for (String arr : ar1) {
			System.out.println(arr);
		}
		
		

	}

}
