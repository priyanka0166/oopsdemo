package oopsdemo2;

class Staff
{
	private int empId;
	private String name;
	protected float salary, hra;
	private float gross;
	
	public Staff(int empId, String name, float salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	void getHra()
	{
		hra = (salary*60)/100;
		System.out.println("HRA: "+hra);
	}
	
	void display()
	{
		//System.out.println("*********Employee Details************");
		System.out.println(empId+ " "+ name+ " "+ salary);
	}
	
	void getGross()
	{
		gross = salary+hra;
		System.out.println("Gross salary of Staff: "+gross);
	}
	
}

class Manager extends Staff
{
	
	protected float da;
	private float gross;
	
	public Manager(int empId, String name, float salary) {
		super(empId, name, salary);

	}
	
	void getDa()
	{
		da = (salary*80)/100;
		System.out.println("DA: "+da);
	}
	
	void getGross()
	{
		gross = salary+hra+da;
		System.out.println("Gross salary of Manager: "+gross);
	}
	
}

class Director extends Manager
{
	private float gross, ta;
	
	public Director(int empId, String name, float salary) {
		super(empId, name, salary);
		
	}
	
	void getTa()
	{
		ta = (salary*30)/100;
		System.out.println("TA: "+ta);
	}
	
	void getGross()
	{
		gross = salary+hra+da+ta;
		System.out.println("Gross salary of Director is "+gross);
	}
	
}

public class MultiLevelDemo2 {

	public static void main(String[] args) {
		
		Director d1 = new Director(1001, "Keane", 5000);
		
		System.out.println("*********Director Details************");
		d1.display();      // Staff
		d1.getHra();      // Staff
		d1.getDa();      // Manager
		d1.getTa();      // Director
		d1.getGross();   // Director
		
		System.out.println();
		
		Manager m1 = new Manager(201, "John", 3500);
		System.out.println("*********Director Details************");
		m1.display();      // Staff
		m1.getHra();      // Staff
		m1.getDa();      // Manager
		m1.getGross();
		
		System.out.println();
		
		Staff s1 = new Staff(301, "Julie", 2000);
		System.out.println("*********Staff Details************");
		s1.display();      // Staff
		s1.getHra(); 
		s1.getGross();
		

	}

}
