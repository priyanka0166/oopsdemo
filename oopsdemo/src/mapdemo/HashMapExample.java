package mapdemo;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String, Double> hm = new HashMap<String, Double>();
		hm.put("John", 5000.25);
		hm.put("Jimi", 4500.12);
		hm.put("Daisy", 650.05);
		hm.put("Jack", 1250.50);
		hm.put("Mike", 3510.25);
		
		System.out.println("Display Customers and Balance Amount\n");
	    for(String k:hm.keySet())
	    {
	    	 System.out.println(k+"-->"+hm.get(k));
	    }
	    
	    // Deposit 1000 to Daisy's account
	    double bal = hm.get("Daisy");
	    hm.put("Daisy", bal+1000);
	    System.out.println("\nDaisy's new balance: "+hm.get("Daisy"));
	    
	    hm.putIfAbsent("Max", 6500.50);
	    System.out.println(hm);
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("\nEnter Customer Name: ");
	    String name = sc.next();
	    System.out.println("The Balance of "+name+ " is :"+hm.get(name));
	    
	    

	}

}
