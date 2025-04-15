// who char only one time occur find this 
package ahmed.StringBufferAndBuilder;

public class StringOccuranceExample1 {

	public static void main(String[] args) {

		String a = "javavth";

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

			if (count == 1 ) {
				System.out.println("occurence of " + a.charAt(i) + " is " + count);
			}
		}

	}

}
