package oopsdemo4;

public class ShapeTest {

	public static void main(String[] args) {
		
		// programming for interfaces not implementation
		Shape sp = new Circle(5);
		
		System.out.println("Using Interface: "+sp.LABLE);
		
		// Circle c = new Circle(5);
		// System.out.println(c.getRadius());
		sp.draw();
		System.out.println("Area of Circle: "+sp.getArea());
		
		// switching from one implementation to another easily
		sp = new Rectangle(10,7);
		
		sp.draw();
		System.out.println("Area of Rectangle: "+sp.getArea());

	}

}
