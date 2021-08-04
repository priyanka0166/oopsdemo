package oopsdemo1;

public class ConstructorDemo{
	
	int id;
	String name;
	float salary;

	ConstructorDemo()  			// Implicit Constructor
	{
		System.out.println("I am Default Constructor");
		
		id = 0;
		name = "";
		salary = 5000.00f;
	}
	
	/*void input(int id, String name)
	{
		
	} */
	
	void display()
	{
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		
		// invokes implicit constructor
		ConstructorDemo cd1 = new ConstructorDemo(); 
		ConstructorDemo cd2 = new ConstructorDemo(); 
		ConstructorDemo cd3 = new ConstructorDemo(); 
		
		cd1.display();
		
	}

}
