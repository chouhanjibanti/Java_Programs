// duplicate element in the 
package CodingQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumberArrayList {

	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,1,3,4,1,3,5,6,2);
		
		
		Set<Integer> unique = new HashSet<>();
		
		Set<Integer> duplicate = new HashSet<>();
		
		for(int num:list) {
			if(!unique.add(num)) {
				duplicate.add(num);
 			}
		}
		
		System.out.println(duplicate);
 	}
}
