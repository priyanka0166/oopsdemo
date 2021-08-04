package oopsdemo2;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		Addition a1 = new Addition();
		
		// invoking add() overload method
		a1.add();
		a1.add(20, 50);
		a1.add(25.14f, 41.85f);
		a1.add(50, 45, 65);
		a1.add("Hello", "World");

	}

}
