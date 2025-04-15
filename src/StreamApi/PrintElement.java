//1. Create a Stream from an ArrayList of integers and print each element

package StreamApi;

import java.util.Arrays;
import java.util.List;

public class PrintElement {
  
	public static void main(String[]args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,9,8,7,6);
		
		System.out.println("print the element ");
		
		numbers.stream().forEach(System.out::println);
	}
}
