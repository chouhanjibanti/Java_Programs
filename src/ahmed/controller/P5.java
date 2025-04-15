package ahmed.controller;

import java.util.ArrayList;
import java.util.ListIterator;

public class P5 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList(); // [java, C#, scala, php, python,Golang]
		al.add("java");
		al.add("c#");
		al.add("javascript");
		al.add("python");
		al.add(10);
		al.add("Golang");

		ListIterator itr = al.listIterator();
		int c = 0;
		while (itr.hasNext()) {
			Object o = itr.next();
			c++;

			if (c == 2) {
				itr.add("scala");
			} else if (o.equals("javascript")) {
				itr.set("php");
			} else if (o.equals(10)) {
				itr.remove();
			}
		}
		System.out.println(al);
	}
}
