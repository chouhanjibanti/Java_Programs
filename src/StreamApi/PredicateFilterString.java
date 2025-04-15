package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFilterString {

	
	public static void main(String[] args) {
		
		// first we will create the arrayList using 
		
		List<String> names = Arrays.asList("john","bobby","jony","akash","pankaj");
		
		Predicate<String> startWithJ = name -> name.startsWith("j");
		
		List<String> filterNames = names.stream().filter(startWithJ).collect(Collectors.toList());
		
		System.out.println(filterNames);
	}
}
