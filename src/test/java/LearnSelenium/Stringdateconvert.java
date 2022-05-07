package LearnSelenium;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Stringdateconvert {

	public static void main(String[] args) {
		
		String str = "2017-9-20";
		
		LocalDate ld = LocalDate.parse(str, DateTimeFormatter.ISO_DATE_TIME);
		
		System.out.println(ld);
	}

}
