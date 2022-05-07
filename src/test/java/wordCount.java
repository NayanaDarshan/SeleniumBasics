
public class wordCount {

	public static void main(String[] args) {

		//getMatchingWordCount("nayana smira darshan", "darshan");
		
		
		getMatchingWordCount("","");
	}

	public static void getMatchingWordCount(String giventext, String matchingword) {

		if (giventext.length() > 1 && giventext != null && giventext != " ") {

			String[] name = giventext.split("\\s");

			int count = 0;

			for (int s = 0; s < name.length; s++) {

				if (name[s].equalsIgnoreCase(matchingword)) {

					System.out.println("The matching text is found===>" + matchingword);

					break;
				}

			}

		}

		else {
			System.out.println("The given string is not valid");
		}

	}

}
