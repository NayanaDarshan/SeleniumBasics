package LearnSelenium;

public class boxingFlow {

	public static void main(String[] args) {
		int a =50;
		
		//boxing/Autoboxing
		Integer a1 = new Integer(a);
		
		Integer a2=50;
		
		System.out.println(a+a1);
		System.out.println(a2);
		
		
		//unboxing
		Integer a3 = new Integer(90);
		
		int i =a3;
		
		System.out.println(i);
				
		try {
			throw new Exception("Nayana Exception");
			
		}
		
		
		catch( Exception e) {
			System.out.println("execption caught");
			e.printStackTrace();
			e.getMessage();
		}
		
		finally {
			System.out.println("Nayana executing the finaly block");
		}
	}

}
