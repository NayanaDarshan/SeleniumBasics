package AppLaunch;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class hasmapTest {

	public static void main(String[] args) {

		HashMap<String, String> names = new HashMap<String, String>();

		names.put("Employee", "Nayana");
		names.put("Manager", "Smira");
		names.put("Executive", "Darshan");

		/*
		 * Iterator<String> it= names.keySet().iterator();
		 * 
		 * while(it.hasNext()) { String key=it.next();
		 * System.out.println("The key is ==>" +key+"The value is==>" +names.get(key));
		 */

		Iterator<String> it1 = names.values().iterator();

		while (it1.hasNext()) {
			String values = it1.next();

			System.out.println(values);
		}

	}

}
