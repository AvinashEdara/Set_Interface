package setInterface;

import java.util.TreeSet;

public class TreeSet_ComparatorA {
	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<Integer>(new MyComparatorA());

		tset.add(545);
		tset.add(477);
		tset.add(686);
		tset.add(204);
		System.out.println(tset);
	}

}
