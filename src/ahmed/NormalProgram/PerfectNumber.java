// check the number is perfect or not
package ahmed.NormalProgram;

public class PerfectNumber {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			int num = i, sum = 0;

			for (int j = 1; j <= num / 2; j++) {
				if (num % j == 0) {
					sum = sum + j;
				}
			}
			if (sum == num) {
				System.out.println(num + " is perfect number");
			}
		}

	}

}
