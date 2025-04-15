// check number is prime number or not
package ahmed.NormalProgram;

public class PrimeNumberProgram {

	public static void main(String[] args) {

		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.println(i + " is prime number");
			} else {
				System.out.println(i + " is not prime number");
			}
		}
	}

	private static boolean isPrime(int num) {
		int count = 0;
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;

			}
		}
		return true;
	}

}
