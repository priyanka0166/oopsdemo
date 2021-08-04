package oopsdemo2;

public class AggregationDemo {

	public static void main(String[] args) {
			
		Address ad1 = new Address("Bengaluru","Karnataka","India", 56601);
		Address ad2 = new Address("Prague","Austin","Czech", 4505 );
		
		Student s1 = new Student(101, "Raj", ad1);
		Student s2 = new Student(102, "Harry", ad2);
		
		s1.display();
		s2.display();
	}

}
