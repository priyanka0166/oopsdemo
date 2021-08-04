package collectionsdemo;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> s = new Stack<String>();
		s.push("Mike");
		s.push("John");
		s.push("Andy");
		s.push("Rod");
		s.push("Mary");
		
		System.out.println("Remove Elemeny: "+s.pop());
		
		Iterator<String> it = s.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("Element on top: "+s.peek());
		System.out.println("Search Andy: "+s.search("Andy"));

	}

}
