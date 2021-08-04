package oopsdemo3;

final class Hello
{
	final void display()
	{
		System.out.println("This is a Final Method");
	}
}

/*  class World extends Hello     // final classes cannot be inherited
{
	// Final methods cannot be overridden
	 	final void display()
		{
			System.out.println("This is a Final Method");
		}
}   
*/

public class FinalDemo {

	public static void main(String[] args) {
		
		final int AGE = 20;
		final float PI = 3.142f;
		
		// AGE = 30; -- Compilation error, final variable values cannot be changes

	}

}
