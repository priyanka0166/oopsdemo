package mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		// Hash map declaration with key-value pairs
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		
		// adding elements
		hmap.put(10, "Sam");
		hmap.put(1, "Max");
		hmap.put(14, "Kurt");
		hmap.put(20, "Annie");
		hmap.put(6, "Ella");
		
		// Display content using iterator
		Set s = hmap.entrySet();      // return values from hmap
		Iterator it = s.iterator();
		
		Set s1 = hmap.keySet();
		System.out.println("Keys: "+s1);
		System.out.println("\n**** Entry Set ****");
		while(it.hasNext())
		{
			Map.Entry mt = (Map.Entry) it.next();
			System.out.println(mt.getKey()+ "-->"+ mt.getValue());
		}
		System.out.println("\n**** Key Set ****");
		Iterator tr = s1.iterator();
		while(tr.hasNext())
		{
			Integer key  =(Integer) tr.next();
			String value = hmap.get(key);
			System.out.println(key+"-->"+value);
		}
		
		// get value based on key
		String name = hmap.get(20);
		System.out.println("\nName of key 20 is "+ name);
		
		// remove value based on key
		hmap.remove(1);
		System.out.println("\nRemaining: "+hmap);
		
	}

}
