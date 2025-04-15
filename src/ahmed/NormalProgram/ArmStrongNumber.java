// ArmStrong Number like 153 is strong number 1*1*1+5*5*5+3*3*3 = 153
package ahmed.NormalProgram;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int no = 155, temp = no, rem = 0, count = 0, sum = 0;
		while (no != 0) {
			count++;
			no = no / 10;
		}
		no = temp;
		while (temp != 0) {
			rem = temp % 10;
			sum = sum + count(rem, count);
			temp = temp / 10;
		}

		if (no == sum) {
			System.out.println(no + " number is armstrong");
		} else {
			System.out.println(no + " number is not armstrong");
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
