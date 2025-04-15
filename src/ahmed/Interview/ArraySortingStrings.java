//   ["java","ruby","python,"dark"] sorting based on the second charcter alphabat
package ahmed.Interview;

public class ArraySortingStrings {
	public static void main(String[] arg) {
		String[] a = { "java", "ruby", "python", "dark" };

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {

				if (compareSecondChar(a[j], a[j + 1]) > 0) {
					String temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}

		}
		for (String s : a) {
			System.out.println(s + " ");
		}

	}

	private static int compareSecondChar(String s1, String s2) {
		char char1 = s1.length() > 0 ? s1.charAt(1) : '\0';
		char char2 = s2.length() > 0 ? s2.charAt(1) : '\0';
		return char1 - char2;
	}
}
