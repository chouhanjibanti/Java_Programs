package ahmed.Interview;

public class SwapingWithoutThird {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		// after swaping

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);

	}

}
