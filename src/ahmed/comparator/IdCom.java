package ahmed.comparator;

import java.util.Comparator;

public class IdCom implements Comparator<Student> {

	public int compare(Student o1, Student o2) {

		return o1.id - o2.id;
	}
}
