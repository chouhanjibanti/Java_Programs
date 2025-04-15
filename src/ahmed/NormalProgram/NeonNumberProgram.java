// Neon number Program
package ahmed.NormalProgram;

public class NeonNumberProgram {

	public static void main(String[] args) {

		int num = 9, sum = 0;
		int m = num * num;

		while (m != 0) {
			int rem = m % 10;
			sum = sum + rem;
			m = m / 10;
		}

		if (sum == num) {
			System.out.println(num + " Number is neon number");
		} else {
			System.out.println(num + " Number is not neon number");
		}

	}

}
