package oopsdemo1;

import oopsdemo3.Demo;

public class TestDemo {

	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		
		// Public access specifier
		System.out.println("Public Variable of class Demo in another pakage: "+d1.a);
		d1.display();

	}

}
