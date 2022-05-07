import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class lasttwocharArray {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("sunday", "monday", "tuesday", "wednesday", "may"));

		for (int i = 0; i < ar.size(); i++) {

			String names = ar.get(i);

			System.out.println("The names are==>" + names);

			if (names.length() > 4) {
				System.out.println("The last 3 chars are===>" + names.substring(names.length() - 3));
			}
		}

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(1, "Nayana");
		hmap.put(2, "Smira");
		hmap.put(3, "Darshan");

		Set<Entry<Integer, String>> entrydata = hmap.entrySet();

		for (Map.Entry<Integer, String> data : entrydata) {

			System.out.println(data.getKey() + "and" + data.getValue());

		}

		Collection<String> valueslist = hmap.values();

		for (String values : valueslist) {
			System.out.println(values);

		}

		Set<Integer> key = hmap.keySet();

		Iterator<Integer> it = key.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}

		hmap.values();
	}

}
