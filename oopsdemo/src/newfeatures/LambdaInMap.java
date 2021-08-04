package newfeatures;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LambdaInMap {

	public static void main(String[] args) {
		
		Map <String, String> books = new HashMap <> ();
        books.put("Let Us C", "Yashwant Kanetkar");
        books.put("Object Oriented Programming using Java", "Simon Kendal");
        books.put("Java: Graphical User Interfaces", "David Etheridge");
        
        // Use Lambda expression to traverse a Map --- Java 8
        books.forEach((key,value) -> System.out.println("Book Name: "+key+
        		" - Author: "+value));
        
        System.out.println("\n--- Normal way to traverse a Map ---");
        // for -in loop --- Java 5
        for(Entry<String,String> e:books.entrySet()) {
        	System.out.println(e.getKey()+" "+e.getValue());
        }

	}

}
