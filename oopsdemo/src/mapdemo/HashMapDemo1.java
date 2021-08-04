package mapdemo;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> languages = new HashMap<>();
	    languages.put(1, "Java");
	    languages.put(2, "Python");
	    languages.put(3, "JavaScript");
	    
	    System.out.println("HashMap: " + languages);
	    
	    	// get() method to get value
	    String value = languages.get(1);
	    System.out.println("\nValue at index 1: " + value);
	    System.out.println("Value at index 3: " + languages.get(3));
	    
	    	// return set of keys and values
	    System.out.println("\nKeys: " + languages.keySet());
	    System.out.println("Values: " + languages.values());
	    
	    	// return set of keys-values pairs
	    System.out.println("\nKeys-Values Mapping: " + languages.entrySet());
	    
	    languages.replace(2, "C++");
	    
	    	// Iterate through Keys -- keySet()
	    System.out.println("\nKeys: ");
	    for(Integer k:languages.keySet())
	    {
	    	 System.out.println(k+"-->"+languages.get(k));
	    }
	    
	    	// Iterate through key-value pairs -- entrySet()
	    System.out.println("\nEntries: ");
	    for(Entry<Integer, String> entry:languages.entrySet())
	    {
	    	 System.out.println(entry);
	    }

	}

}
