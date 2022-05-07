import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicatecharcount {

	public static void main(String[] args) {
		// getCharCount("nayana");

		// getDuplicateCharCount("nayana");

		getBlankSpaceCount(" Nayana Smira dar han ");

	}

	public static void getCharCount(String name) {

		char[] ch = name.toCharArray();

		HashMap<Character, Integer> chmap = new HashMap<Character, Integer>();

		for (char chardata : ch) {

			if (chmap.containsKey(chardata)) {

				chmap.put(chardata, chmap.get(chardata) + 1);
			}

			else {
				chmap.put(chardata, 1);
			}
		}
		System.out.println(chmap);
	}

	public static void getDuplicateCharCount(String name) {

		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

		if (name == null) {
			return;
		}

		else if (name.length() == 1) {
			return;
		}

		else if (name.isEmpty()) {
			return;
		}

		char[] ch = name.toCharArray();

		for (char chardata : ch) {

			if (hmap.containsKey(chardata)) {

				hmap.put(chardata, hmap.get(chardata) + 1);
			} else {
				hmap.put(chardata, 1);
			}

		}

		Set<Entry<Character, Integer>> entrydata = hmap.entrySet();

		for (Map.Entry<Character, Integer> mapdata : entrydata) {

			// System.out.println("The key is ===> "+mapdata.getKey());
			// System.out.print("The value is===>" +mapdata.getValue());

			if (mapdata.getValue() > 1) {
				System.out.println("The duplicate character is ===>" + mapdata.getKey() + " and it's count is"
						+ mapdata.getValue());

			}

		}
	}

	public static void getBlankSpaceCount(String name) {

		char[] ch = name.trim().toCharArray();

		HashMap<Character, Integer> chmap = new HashMap<Character, Integer>();

		for (char chardata : ch) {

			if (chmap.containsKey(chardata)) {

				chmap.put(chardata, chmap.get(chardata) + 1);

			}

			else {
				chmap.put(chardata, 1);
			}

		}
	//	System.out.println(chmap);

		Set<Entry<Character, Integer>> entrydata = chmap.entrySet();

		for (Map.Entry<Character, Integer> chmapdata : entrydata) {

			if (chmapdata.getValue()==' ') {

				System.out.println(
						"The key is ===>" +chmapdata.getKey()+ "and the value is===>" + chmapdata.getValue());

			}
		}

	}
}
