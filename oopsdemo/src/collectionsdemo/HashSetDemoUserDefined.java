package collectionsdemo;

import java.util.HashSet;
import java.util.Set;

// Hash set with User Defined objects 
public class HashSetDemoUserDefined {

	public static void main(String[] args) {
		
		Set<Customer> customer = new HashSet<Customer>();
		
		customer.add(new Customer(101,"Andy","Spain"));
		customer.add(new Customer(102,"Mike","New York"));
		customer.add(new Customer(105,"Navi","US"));
		customer.add(new Customer(103,"John","Sydney"));
		customer.add(new Customer(104,"Max","Japan"));
		
		/*
        HashSet will use the `equals()` & `hashCode()` implementations 
        of the Customer class to check for duplicates and ignore them
      */
		
		customer.add(new Customer(103,"John","Sydney"));
		
		for(Customer i: customer)
			System.out.println(i.getId()+" "+i.getName()+" "+i.getCity());
		
		

	}

}
