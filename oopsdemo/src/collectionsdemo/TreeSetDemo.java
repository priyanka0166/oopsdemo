package collectionsdemo;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		// Creating a TreeSet
        TreeSet<String> fruits = new TreeSet<>();

        // Adding new elements to a TreeSet
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println("Fruits Set : " + fruits);

        // Duplicate elements are ignored
        fruits.add("Apple");
        System.out.println("After adding duplicate element \"Apple\" : " + fruits);

        // This will be allowed because it's in lower case.
        fruits.add("banana");
        
        System.out.println("\nAfter adding \"banana\" : " + fruits);
        
        TreeSet<Integer> test = new TreeSet<Integer>();
        test.add(22);
        test.add(212);
        test.add(741);
        test.add(547);
        test.add(231);
        test.add(610);
        
        System.out.println("\nTree Set: "+test);
        
        TreeSet<Integer> test1 = new TreeSet<Integer>(Comparator.reverseOrder());
        test1.add(22);
        test1.add(212);
        test1.add(741);
        test1.add(547);
        test1.add(231);
        test1.add(610);
        
        System.out.println("\nTree Set(Reverse): "+test1);

	}

}
