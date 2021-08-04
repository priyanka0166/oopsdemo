package oopsdemo3;

class Count               // Instance class
{
	static int cnt;
	int a;
	
	Count()
	{
		cnt += 1;
		a = 100;
	}
	
	static void display()      // Static Method
	{
		System.out.println("No. of objects created: "+cnt);
	}
	
	void print()
	{
		System.out.println("Instance Method");
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		Count c4 = new Count();
		
		c1.print();
						
		Count.display();    // invoke static method
		

	}

}
