package LearnSelenium;

public class primeNumTest {

	public static void main(String[] args) {
		System.out.println(isPrime(9));

		getFibonacciNum(10);
	}

	public static boolean isPrime(int num) {

		boolean status = true;

		for (int i = 2; i < num; i++) {

			if (num % 2 == 0) {
				status = false;
			}
		}
		return status;
	}

	public static void getFibonacciNum(int num) {
		int m = 0;

		int n = 1;
		
		for (int i = 1; i <= num; i++) {
			

			System.out.println(m);
			
			int sum = m + n;
			m = n;
			n = sum;

		}
	}
}
