
public class removeSpace {

	public static void main(String[] args) {
		String name = "    Nayana      ";

		String trimname = name.trim();

		System.out.println(trimname);

		/*
		 * String removedSpacename = trimname.replaceAll(" ", "");
		 * 
		 * System.out.println(removedSpacename);
		 * 
		 */

		String removedspace ="";

		for (int i = 0; i < trimname.length(); i++) {

		//	System.out.println(trimname.charAt(i));

			if (trimname.charAt(i) != ' ' && trimname.charAt(i) != '\t') {

				removedspace = removedspace + trimname.charAt(i);

			}

		}
		
		System.out.println(removedspace);
	}

}
