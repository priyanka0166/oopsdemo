package oopsdemo2;

public class Developer extends Employee {
	
	String technology;
	
	public Developer(int empId, String name, String tech) {
		super(empId, name);
		this.technology = tech;
		
	}
	
	void display1()
	{
		System.out.println("Technology: " +technology);
	}
	

}
