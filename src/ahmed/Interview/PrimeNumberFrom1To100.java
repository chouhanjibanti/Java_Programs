package ahmed.Interview;

public class PrimeNumberFrom1To100 {

	public static void main(String[] args) {

//		int num = 4;

		for (int j = 2; j <= 100; j++) {
			int count = 0;
			for (int i = 2; i <= j / 2; i++) {
				if (j % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(j + "number is prime number");
			}
		}

	}

}
