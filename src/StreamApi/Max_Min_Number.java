//4. Find the maximum and minimum numbers from a list

package StreamApi;

import java.util.Arrays;
import java.util.List;

public class Max_Min_Number {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10,42,11,30,50,90,1,4);
		
		System.out.println("Print maximum number");
		
		int max = numbers.stream().max(Integer::compareTo).get();
		
		System.out.println(max);
		
		
		System.out.println("Print manimum number");
		
		int min = numbers.stream().min(Integer::compareTo).get();
		
		System.out.println(min);	
	}
}
