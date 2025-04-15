package ahmed.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DynamicallySort {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the String : ");
		String s = scan.next();

		Comparator<Student> c = new IdCom();
		if (s.equalsIgnoreCase("name")) {
			c = new NameCom();
		} else if (s.equalsIgnoreCase("marks")) {
			c = new MarkCom();
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
