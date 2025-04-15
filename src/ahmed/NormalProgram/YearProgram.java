// Leap year / bissextile / intercalary year
package ahmed.NormalProgram;

public class YearProgram {

	public static void main(String[] args) {

		int year = 2000; // every four year leap year come.

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("leap year");
		} else {
			System.out.println("not leap year");
		}

	}

}
