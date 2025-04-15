package StreamApi;

import java.util.Arrays;
import java.util.List;

public class FilterEven {

	public static void main(String[]args) {
		
		 List<Integer> numbers = Arrays.asList(10,11,34,21,60,89,98);
		 
		 System.out.println("print the even number");
		 
		 numbers.stream().filter(n-> n%2 == 0).forEach(System.out::println);
	}
}
