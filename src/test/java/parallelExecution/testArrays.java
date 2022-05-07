package parallelExecution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testArrays {

	public static void main(String[] args) {
		String[] assignedcodes = {"003","005"};
		
		String[] allcodes = {"001","002", "003", "004", "005", "006"};
		
		String[] unassignedcodes =getunassignedcodes(allcodes, assignedcodes);
		System.out.println(Arrays.toString(unassignedcodes));
		
		
		}

	
	public static String[] getunassignedcodes(String[] allcodes, String[] assignedcodes) {
		
		List<String> list1 = new ArrayList<String>(Arrays.asList(allcodes));
		List<String> list2 = new ArrayList<String>(Arrays.asList(assignedcodes));
		
		List<String> list3= new ArrayList<String>();
		
		list1.removeAll(list2);
		
		return list1.toArray(new String[list1.size()]);
		
		
		
	}

}
