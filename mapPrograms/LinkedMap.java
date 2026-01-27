package mapPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedMap {
	public static void main(String[] args) {
		LinkedHashMap map= new LinkedHashMap();
		map.put(1, "Kavya");
		map.put(2,null);
		map.putIfAbsent(2, "Tanisha");
		System.out.println(map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		for( Object o:map.entrySet()) {
			System.out.println(o);
		}
	}
}
