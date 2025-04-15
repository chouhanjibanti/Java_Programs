package ahmed.NormalProgram;

public class Pallandrome {

	public static void main(String[] args) {

		int num = 153, rev = 0, rem, n = num;
		while (num != 0) {
			rem = num % 10;
			rev = rem + (rev * 10);
			num = num / 10;
		}
		if (rev == n) {
			System.out.println(n + " number is pallndrome");
		} else {
			System.out.println(n + " number is not pallndrome");
		}

	}

}
