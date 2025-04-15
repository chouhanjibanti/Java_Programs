// SpyNumber
package ahmed.NormalProgram;

public class SpyNumberProgram {

	public static void main(String[] args) {

		int num = 1124;
		int sum = 0;
		int pro = 1;
		int temp = num;
		while (num != 0) {
			int rem = num % 10;
			sum = sum + rem;
			pro = pro * rem;
			num = num / 10;
		}
		if (sum == pro) {
			System.out.println(temp + " number is spy number");
		} else {
			System.out.println(temp + " number is not spy number");
		}

	}

}
