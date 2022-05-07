package LearnSelenium;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hasmapTest {
	
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> test = new HashMap<Integer, String>();
		test.put(1, "Nayana");
		test.put(2, "Smira");
		
	System.out.println(test.get(2));
	

	Set<Integer> key= test.keySet();
	
	Iterator it =key.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	for(Map.Entry<Integer, String> map1 : test.entrySet()) {
	System.out.println(map1.getKey() +"and"+map1.getValue());
	
		
	}
	
	test.forEach((k,v) -> System.out.println("Key is ===>"+k +"and value is===> "+v ));
	}	
	
	  
}
