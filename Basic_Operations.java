package setInterface;

import java.util.HashSet;

public class Basic_Operations {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<>();
		h.add("Avinash");
		h.add("Ammalu");
		h.add("Vikram");
		h.add("Gowtham");

		System.out.println("Is the set empty ? " + h.isEmpty());
		System.out.println("Size of HashSet is " + h.size());
		System.out.println(h.contains("Ammalu"));
		h.remove("Vikram");
		System.out.println(h);
	}
}
/**
 * OUTPUT
 * is empty()
 * False
 * 
 * size()
 * 4
 * 
 * contains()
 * True
 * 
 * remove()
 * [Gowtham,Ammalu,Avinash]
*/

