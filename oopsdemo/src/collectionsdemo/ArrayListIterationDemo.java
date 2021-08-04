package collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterationDemo {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("James");
		names.add("Andy");
		names.add("Micheal");
		names.add("Jim");
		names.add("Robert");
		
		System.out.println(names);
		
		Iterator<String> itr = names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(names.get(1));
		
		names.add(3, "Jack");
		names.remove(0);
		names.set(1, "Java");  // replace existing element
		
		System.out.println("\n*** Display collection using for-each loop ***");
		
		for(String i: names)
			System.out.println(i);
		
		ArrayList<Double> marks = new ArrayList<Double>();
		marks.add(85.54);
		marks.add(65.14);
		marks.add(71.87);
		marks.add(82.04);
		marks.add(79.24);
		
		System.out.println("\nMarks: ");
		for(Double i: marks)
			System.out.println(i);
		
  
	}

}
