// primenumber program -  any number divide by itself starting from 2
package ahmed.Interview;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 4;
		int count = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}

	}

}
