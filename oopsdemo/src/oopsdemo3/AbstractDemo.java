package oopsdemo3;

public class AbstractDemo {

	public static void main(String[] args) {
		
		Trainee t1 = new Marks("John", "New York", 1001, 35);
		
		t1.show();
		double mark = t1.calculateMarks();
		System.out.println(mark);
		System.out.println(t1);

	}

}
