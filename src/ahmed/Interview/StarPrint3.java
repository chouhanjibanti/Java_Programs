//    *
//   **
//  ***
// ****
//*****
package ahmed.Interview;

public class StarPrint3 {

	public static void main(String[] args) {

		int space = 5;
		int str = 0;
		for (int i = 1; i <= 5; i++) {
			space--;
			str++;
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= str; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
