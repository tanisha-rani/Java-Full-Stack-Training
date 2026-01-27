package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
	public static void main(String[]args) {
		ArrayList<Integer> al= new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		
		
		System.out.println("===========");
		//stream();
		al.stream()
		.forEach(System.out::println);
		
		System.out.println("===========");
		List<String>names=Arrays.asList("Shraddha","Kavya","Rohit","Tanisha");
		names.stream()
		.forEach(System.out::println);
		
		System.out.println("===========");
		//for counting values 
		long count=names.stream()
				.count();
		System.out.println(count);
		System.out.println("===========");
		
		//filter 
		names.stream()
		.filter(s ->s.length()>5)
		.forEach(System.out::println);
		
		System.out.println("===========");
		//number filter
		List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,90);
		numbers.stream()
		.filter(n->n%2==0)
		.forEach(System.out::println);
		
		//map
		System.out.println("=======");
		List<Integer> doubled= numbers.stream()
		.map( n-> n*2)
		.collect(Collectors.toList());
		System.out.println(doubled);
		
		System.out.println("=======");
		List<String> uppercase= names.stream()
				.map(n-> n.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(uppercase);
	}
}
