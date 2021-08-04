package collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		// Create list of books
		List<Book> b = new ArrayList<Book>();
		
		// Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        
        // add books to list
        b.add(b1);
        b.add(b2);
        b.add(b3);
        
        System.out.println("**** Book Details ****\n");
        // Traverse a list
        for(Book i:b)
        	System.out.println(i.id+" "+i.name+" "+i.author+" "+i.publisher+" "+i.quantity);
        
        System.out.println("\nTotal no. of Books: "+b.size());

	}

}
