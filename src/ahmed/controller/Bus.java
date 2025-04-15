// If the sort the object in the collection ,collection must contains generic type of object otherwise we het ClassCastException.
// The generic type of object added into the collection who's blueprint must implements comparable interface, compareTo() must be overrided.
package ahmed.controller;

public class Bus implements Comparable<Bus> {

	String bN;
	int nOS;

	public Bus(String bN, int nOS) {
		super();
		this.bN = bN;
		this.nOS = nOS;
	}

	@Override
	public String toString() {
		return "Bus [bN=" + bN + ", nOS=" + nOS + "]";
	}

//	@Override
//	public int compareTo(Bus o) { // sorting based on the brandName
//		
//		return this.bN.compareTo(o.bN);
//	}

	@Override
	public int compareTo(Bus o) { // sorting based on the number of seats

		if (this.nOS > o.nOS) {
			return -1;
		} else if (this.nOS < o.nOS) {
			return 1;
		}
		return 0;
	}

}
