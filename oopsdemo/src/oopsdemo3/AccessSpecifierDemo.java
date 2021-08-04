package oopsdemo3;

class Test
{
	int a;              // default variable
	private int b;       
	protected int c;   // can be accessed in derived / sub class
	
	
	
	public Test(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
	}

	public void display()
	{
		System.out.println("Private Variable: "+b);
	}
}

class Test2 extends Test
{

	public Test2(int a, int b, int c) {
		super(a, b, c);
		
	}
	
	public void display()
	{
		System.out.println("Protected Variable: "+c);
	}
}

public class AccessSpecifierDemo {

	public static void main(String[] args) {
		
		Test t1 = new Test(100, 200, 300);
		t1.display();
		
		// t1.b=50;    -- Compiler Error as private variable can't be accessed 
		
		System.out.println("Default Variable: "+ t1.a);
		
		

	}

}
