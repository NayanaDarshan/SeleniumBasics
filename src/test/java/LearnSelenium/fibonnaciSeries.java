package LearnSelenium;

public class fibonnaciSeries {

	public static void main(String[] args) {
	
	//	0,1,1,2,3,6
		
		int m=0;
		
		int n=1;
		
		int num=10;
		
		for (int i=1; i<=num; i++) {
			
			System.out.println(m);
			
			int sum = m+n;
			m=n;
			n=sum;
			
		}

	}

}
