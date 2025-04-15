package ahmed.controller;

import java.util.ArrayList;
import java.util.Collections;

public class BusSort {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(new Bus("orange", 65));
		al.add(new Bus("Kaveri", 70));
		al.add(new Bus("masarda", 65));
		al.add(new Bus("rani", 55));

		System.out.println(al);
		Collections.sort(al);
//		Collections.reverse(al);
		System.out.println(al);

	}

}
