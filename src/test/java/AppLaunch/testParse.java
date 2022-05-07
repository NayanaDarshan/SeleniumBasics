package AppLaunch;

public class testParse {

	public static void main(String[] args) {
		int i = 10;

		int j = 20;

		String str = String.valueOf(i);

		System.out.println("The value is===>" + (str + j));
		
		try {
		throw new Exception("Nayanaexpection");
		
		}
		catch( Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
		
	}
}