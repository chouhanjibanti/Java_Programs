//5. Find the longest string in a list using Java Streams

package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("programming", "javaisalan", "palsiya");

		System.out.println("printing the longest String");

		String longest = words.stream().max(Comparator.comparingInt(String::length)).get();

		System.out.println(longest);
	}

}
