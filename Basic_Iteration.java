package setInterface;

import java.util.HashSet;
import java.util.Iterator;

public class Basic_Iteration {
	public static void main(String[] args) {

		HashSet<String> h = new HashSet<>();
		h.add("Avinash");
		h.add("Ammalu");
		h.add("Vikram");
		h.add("Gowtham");

		// Using iterator
		Iterator<String> itr = h.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Using For-each Loop
		for (String s : h)
			System.out.print(s + " ,");
		System.out.println();

		// using normal method

		System.out.println(h);

	}
}
/**
 * OUTPUT
 * 
 * Using Iterator Vikram Gowtham Avinash Ammalu
 * 
 * Using For-each Ammalu,Avinash,Gowtham,Vikram
 * 
 * Using normal method [Avinash,Ammalu,Gowtham,Vikram]
 * 
 */
