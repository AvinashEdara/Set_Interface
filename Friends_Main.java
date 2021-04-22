package setInterface;

import java.util.HashSet;
import java.util.Iterator;

public class Friends_Main {
	public static void main(String[] args) {
		HashSet<Friends> h = new HashSet<>();

		Friends a = new Friends("Avinash", "ECE");
		Friends b = new Friends("Ammalu", "ECE");
		Friends c = new Friends("Vikram", "CSE");
		Friends d = new Friends("Gowtham", "Mech");

		h.add(a);
		h.add(b);
		h.add(c);
		h.add(d);

		Iterator<Friends> itr = h.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
/**
 * Friends [name=Gowtham, department=Mech]
 * 
 * Friends [name=Vikram, department=CSE]
 * 
 * Friends [name=Avinash, department=ECE]
 * 
 * Friends [name=Ammalu, department=ECE]
*/
