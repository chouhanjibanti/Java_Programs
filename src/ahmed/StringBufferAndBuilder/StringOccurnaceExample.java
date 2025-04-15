// find the number of Occurence of each and every character
package ahmed.StringBufferAndBuilder;

public class StringOccurnaceExample {

	public static void main(String[] args) {

		String a = "javavecl bunty";

		for (int i = 0; i < a.length(); i++) {
			int count = 0;
			for (int j = 0; j < a.length(); j++) {

				if (a.charAt(i) == a.charAt(j) && i > j) {
					break;
				}
				if (a.charAt(i) == a.charAt(j)) {
					count++;
				}
			}

			if (count > 0) {
				System.out.println("Occurance of  " + a.charAt(i) + " : " + count);
			}

		}

	}

}
