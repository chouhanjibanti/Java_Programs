package StreamApi;

import java.util.function.Predicate;

public class PredicateFIlterNumber {

	
	public static void main(String[] args) {
		
		Predicate<Integer> isGreaterThanten = number -> number>10;
		
		System.out.println(isGreaterThanten.test(12));
		System.out.println(isGreaterThanten.test(3));
	}
}
