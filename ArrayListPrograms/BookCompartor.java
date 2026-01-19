package ArrayListPrograms;

import java.util.Comparator;

public class BookCompartor implements Comparator<Books>{
	public int compare(Books o1, Books o2) {
		return o1.price- o2.price;
	}
}
