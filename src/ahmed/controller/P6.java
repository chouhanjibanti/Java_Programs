package ahmed.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class P6 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(); // [java, C#, scala, php, python,Golang]
		al.add("java");
		al.add("c#");
		al.add("javascript");
		al.add("python");
		al.add(10);
		al.add("Golang");

//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}

//		for(Object o: al) {
//			System.out.println(o);
//		}

//		Iterator itr = al.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}

//		ListIterator itr = al.listIterator();
//	    while(itr.hasPrevious()) {
//	    	System.out.println(itr.previous());
//	    }

		ListIterator itr = al.listIterator(al.size());
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
