// reverse Program
package ahmed.NormalProgram;

public class ReverseProgram {

	public static void main(String[] args) {

		int num = 15498, rem = 0, rev = 0;

		while (num != 0) {
			rem = num % 10;
			rev = rem + (rev * 10);
			num = num / 10;
		}
		System.out.println(rev);
	}
}
