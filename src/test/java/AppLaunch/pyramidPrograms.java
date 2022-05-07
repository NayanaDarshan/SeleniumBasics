package AppLaunch;

public class pyramidPrograms {

	public static void main(String[] args) {
		int rows=5;
		
		for(int i=1; i<=5; i++) {
					for(int j=1; j<=i; j++) {
						
						System.out.print(j+ " ");
		}
		
					System.out.println(" ");

	}
		
		System.out.println("**********************************************");
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j ++) {
				
				System.out.print("*"+" ");
			}
			
			System.out.println(" ");
		}
		
		System.out.println("******************************************");

		for(int i=rows; i>=1; i--) {
			
			for(int j=1; j<=i;j++) {
				
				System.out.print("*"+ " ");
			}
			
			System.out.println(" ");
		}
		System.out.println("**********************************************");
		
		for(int i=rows; i>=1; i--) {
			for(int j1=1; j1<=i; j1++) {
				System.out.print(j1+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("******************Floyd's traingle***********************");
		
		int number=1; int rows1=6;
		
		for(int i=1; i<=rows1; i++) {
			for(int j=1; j<=i; j++) {
				
				System.out.print(number+ " ");
				
				number++;
			}
			System.out.println(" ");
		}
		
}

}