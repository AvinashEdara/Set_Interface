package setInterface;

import java.util.TreeSet;

public class TreeSet_ComparatorB {
	public static void main(String[] args) {
		TreeSet<String> tset = new TreeSet<String>(new MyComparatorB());
		tset.add("Avinash");
		tset.add("Ammalu");
		tset.add("Thanmayi");
		tset.add("Sriyansh");
		System.out.println(tset);
	}
}
