package ahmed.Interview;

public class FaboncciSeries {

	public static void main(String[] args) {

		int f1 = 0, f2 = 1, f3 = 0;

		System.out.println(f1);
		System.out.println(f2);

		while (f3 <= 100) {
			f3 = f1 + f2;
			System.out.println(f3);
			f1 = f2;
			f2 = f3;
		}

	}

}
