package newfeatures;

import java.util.ArrayList;
import java.util.List;

public class StringsExample {

	public static void main(String[] args) {
		
		List<Products> p1 = new ArrayList<Products>();
		p1.add(new Products(101, "Mac Book", 150000f));
		p1.add(new Products(102, "Lenovo Laptop", 48000f));
		p1.add(new Products(103, "Hp Laptop", 35000f));
		p1.add(new Products(104, "Dell Laptop", 25000f));
		p1.add(new Products(105, "Asus Laptop", 27000f));
		
		System.out.println("--- Display Products --- ");
		p1.stream()
				.forEach(p -> System.out.println(p.id+" "+p.name+ "\t"+p.price));
		
		System.out.println("\nLaptop price greater than 30,000 ");
		p1.stream().filter(p -> p.price>30000)
				.forEach(p -> System.out.println(p.name));

	}

}
