package AppLaunch;

public class starpattern4 {

	public static void main(String[] args) {
		int alpha=65;
		
		for(int i=0; i<=6; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)alpha+ " ");
			}
			alpha++;
			System.out.println(" ");
		}

	}

}
