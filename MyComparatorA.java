package setInterface;

import java.util.Comparator;

public class MyComparatorA implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer a = (Integer) o1;
		Integer b = (Integer) o2;
		if (a < b)
			return +1;
		else if (a > b)
			return -1;
		else
			return 0;
	}

}
