// Swap without third variable
package ahmed.NormalProgram;

public class SwapWithoutThird {

	public static void main(String[] args) {

		int a = 30, b = 40;

		// first way
		a = a + b;
		b = a - b;
		a = a - b;

		// second way
//		a = a*b;
//		b = a/b;
//		a = a/b;

		System.out.println(a);
		System.out.println(b);
	}
}
