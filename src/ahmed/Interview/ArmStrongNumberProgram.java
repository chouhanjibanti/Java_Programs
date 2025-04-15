package ahmed.Interview;

public class ArmStrongNumberProgram {

	public static void main(String[] args) {

		int num = 153, n = num, sum = 0, count = 0;

		while (num > 0) {
			count++;
			num = num / 10;
		}

		n = num;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + count(rem, count);
			n = n / 10;
		}
		if (sum == num) {
			System.out.println("number is armstrong");
		} else {
			System.out.println("number is not armstrong");
		}

	}

	public static int count(int rem, int count) {
		int pro = 1;
		for (int i = 1; i <= count; i++) {
			pro = pro * rem;
		}
		return pro;
	}

}
