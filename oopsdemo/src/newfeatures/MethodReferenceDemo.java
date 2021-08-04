package newfeatures;

interface hello {
	void welcome();
}

public class MethodReferenceDemo {
	
	public static void display() {
		System.out.println("Hello from Method Reference");
	}
	public void print() {
		System.out.println("Instance method call using Method Reference");
	}
	public MethodReferenceDemo() {
		System.out.println("In Constructor");
	}
	public static void main(String[] args) {
		// invoke static method
		hello h = MethodReferenceDemo :: display;
		h.welcome();
		
		MethodReferenceDemo d1 = new MethodReferenceDemo();
		hello h1 = d1::print; 		//invoke intance method
		h1.welcome();
		
		// Method Reference to constructor 
		hello h2 = MethodReferenceDemo :: new;
		h2.welcome();
	}

}
