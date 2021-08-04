package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Java");
		a1.add("Perl");
		a1.add("C++");
		a1.add("C# 5.0");
		
		
		System.out.println(a1);
		System.out.println("Element at index 1: "+a1.get(2));
		System.out.println("Does list contains Perl? "+a1.contains("Perl"));
		
		a1.add(2, "Oracle");
		System.out.println("\n"+a1);
		
		System.out.println("\nIs ArrayList Empty? "+a1.isEmpty());
		System.out.println("Index of Java: "+a1.indexOf("Java"));
		System.out.println("Size of array list: "+a1.size());
		
		Collections.sort(a1);
		System.out.println("\nArray List after Sorting: "+a1);
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(100);
		a2.add(550);
		a2.add(75);
		a2.add(10);
		a2.add(45);
		
		System.out.println("\n"+a2);
		System.out.println("Size: "+a2.size());

	}

}
