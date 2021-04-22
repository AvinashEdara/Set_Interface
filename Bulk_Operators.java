package setInterface;

import java.util.HashSet;

public class Bulk_Operators {
	public static void main(String[] args) {

		HashSet<String> h = new HashSet<>();
		h.add("Avinash");
		h.add("Ammalu");
		h.add("Vikram");
		h.add("Gowtham");

		HashSet<String> t = new HashSet<>();
		t.add("Dhaval");
		t.add("Nidhi");
		t.add("Badal");
		t.add("Amit");

		h.addAll(t);
		System.out.println(h);

		h.removeAll(t);
		System.out.println(h);
		System.out.println(t);

		h.retainAll(t);
		System.out.println(h);

		System.out.println("h contains all of t ? " + h.containsAll(t));
	}
}
/**
 * [Avinash, Dhaval, Nidhi, Ammalu, Gowtham, Amit, Vikram, Badal]
 * [Avinash, Ammalu, Gowtham, Vikram]
 * [Dhaval, Nidhi, Amit, Badal]
 * []
 * h contains all of t ? false
 */
