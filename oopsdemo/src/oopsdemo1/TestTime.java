package oopsdemo1;

public class TestTime {

	public static void main(String[] args) {
		
		Time t1 = new Time(4,2,50); 
		Time t2 = new Time(8,20,30); 
		
		t1.add(t2);
		
		System.out.println("The addition of 2 Time: ");
		t1.display();

	}

}
