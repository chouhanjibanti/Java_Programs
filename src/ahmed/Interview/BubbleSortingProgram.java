package ahmed.Interview;

public class BubbleSortingProgram {

	public static void main(String[] args) {

		int a[] = { 3, 2, 5, 1, 9 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 1; j < a.length - i; j++) {
				if (a[j - 1] > a[j]) {
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}

		}
		for (int b : a) {
			System.out.println(b);
		}

	}

}
