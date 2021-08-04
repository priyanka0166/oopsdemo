package collectionsdemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		// Create a LinkedList
	    LinkedList<String> linkedlist = new LinkedList<String>();
	 
	    // Add elements to LinkedList
	    linkedlist.add("Delhi");
	    linkedlist.add("Agra");
	    linkedlist.add("Mysore");
	    linkedlist.add("Chennai");
	    linkedlist.add("Pune");
	 
	    // Obtaining ListIterator
	    ListIterator listIt = linkedlist.listIterator();
	 
	    // Iterating the list in forward direction
	    System.out.println("Forward Iteration:");
	    while(listIt.hasNext()){
	       System.out.println(listIt.next());
	    }

	    // Iterating the list in backward direction
	    System.out.println("\nBackward Iteration:");
	    while(listIt.hasPrevious()){
	       System.out.println(listIt.previous());

	    }
	    
	    
	}
}
