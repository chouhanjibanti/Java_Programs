package ahmed.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI_Example {

	public static void main(String[] args) {

//		List<Integer> list1 = List.of(3,4,8,2,9);

		List<Integer> list2 = new ArrayList<>();
		list2.add(34);
		list2.add(45);
		list2.add(13);

		List<Integer> list3 = Arrays.asList(34, 2, 36, 78, 35);

		// without stream

//		List<Integer> listEven = new ArrayList<Integer>();
//		for(Integer i : list3)
//		{
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}

		// with stream

//		Stream<Integer> list4 = list3.stream();
//		
//		List<Integer> newList = list4.filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(newList);

		List<Integer> newList = list3.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.err.println(newList);
	}

}
