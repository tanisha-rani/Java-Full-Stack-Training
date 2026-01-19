package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.*;


public class BookApp {
	public static void main(String[] args) {
		ArrayList<Books> b1= new ArrayList<>();
		b1.add(new Books (300));
		b1.add(new Books (250));
		b1.add(new Books (500));
		b1.add(new Books (1000));
		b1.add(new Books (380));
		b1.add(new Books (100));
		
		System.out.println("Before Sorting"+b1);
		
//		Collections.sort(b1);
		
		Collections.sort(b1, new BookCompartor());
		System.out.println("After sorting: "+b1);
		
		
		
		
		
		
	}
}
