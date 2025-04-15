//*****
// ****
//  ***
//   ** 
//    *
package ahmed.Interview;

public class StarPrint2 {

	public static void main(String[] args) {
		int str = 6;
		int space = -1;
		for (int i = 1; i <= 5; i++) {
			str--;
			space++;
			for (int k = 1; k <= space; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= str; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
