package ahmed.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentTest {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(0, "Banti", 88));
		al.add(new Student(9, "Pankaj", 75));
		al.add(new Student(7, "Ashish", 45));
		al.add(new Student(2, "durgesh", 69));

		System.out.println(al);
//		Collections.sort(al,new MarkCom());
//		Collections.sort(al, new IdCom());
		Collections.sort(al, new NameCom());
		System.out.println(al);

	}

}
