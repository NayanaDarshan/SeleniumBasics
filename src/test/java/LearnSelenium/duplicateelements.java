package LearnSelenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class duplicateelements {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7,1,10,11,12,13));
		
		Set<Integer> set1= new HashSet<Integer>(ar);
		
		Iterator it =set1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
