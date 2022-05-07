package AppLaunch;

public class starpattern3 {

	public static void main(String[] args) {

		//int alpha=65;-> capital A
		
		int alpha=97;

		for(int i=0; i<=4; i++) {
			
			for(int j=0; j<=i; j++) {
				System.out.print( (char)(alpha+j)+" ");
			}
			
			System.out.println(" ");
		}
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		for(int i=0; i<=4; i++){
			for(int j=4; j>=i; j--) {
				System.out.print((char)(alpha+j)+ " ");
			}
			System.out.println(" ");
		}
	}

}
