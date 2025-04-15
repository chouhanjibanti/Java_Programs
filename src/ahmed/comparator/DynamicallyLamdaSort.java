package ahmed.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DynamicallyLamdaSort {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the String : ");
		String s = scan.next();

		Comparator<Student> c = (o1, o2) -> {
			return o1.id - o2.id;
		};
		if (s.equalsIgnoreCase("name")) {
			c = (o1, o2) -> {
				return o1.name.compareTo(o2.name);
			};
		}
		if (s.equalsIgnoreCase("marks")) {
			c = (o1, o2) -> {
				if (o1.marks > o2.marks) {
					return -1;
				} else if (o1.marks < o2.marks) {
					return 1;
				}
				return 0;
			};
		}

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(0, "Banti", 88));
		al.add(new Student(9, "Pankaj", 75));
		al.add(new Student(7, "Ashish", 45));
		al.add(new Student(2, "durgesh", 69));

		Collections.sort(al, c);
		System.out.println(al);

	}

}
