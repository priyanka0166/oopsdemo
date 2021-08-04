package oopsdemo1;

class Test
{
	// Override finalize() method of Object class
	public void finalize()
	{
		System.out.println("Object Destroyed and Garbage Collected");
	}
}

public class DestructorDemo {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		Test t2 = new Test();
		
		// De-allocate Memory
		t1 = null;
		t2 = null;
		
		// invoke service method gc() --> invoke finalize()
		System.gc();
		
		System.out.println("In Main Method");

	}

}
