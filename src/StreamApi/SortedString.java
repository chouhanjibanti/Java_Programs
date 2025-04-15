//3. Sort a list of strings in alphabetical order using Streams

package StreamApi;

import java.util.Arrays;
import java.util.List;

public class SortedString {

	public  static void main(String[]args) {
		
		List<String> names = Arrays.asList("Banana","Apple","Mango","sapota");
		
		System.out.println("Printing the String after the sorting");
		
		names.stream().sorted().forEach(System.out::println);
	}
}

//.sorted() sorts the list in ascending order.


