package newfeatures;

interface MathOperation {
	int operation(int a, int b);
}

interface GreetingService {
	void sayMessage(String message);
}

public class LambdaDemo1 {

	public static void main(String[] args) {

		//with type declaration
		MathOperation addition = (int a, int b) -> a + b;
		System.out.println("Addition: "+addition.operation(55, 20));

		//with out type declaration
		MathOperation subtraction = (a, b) -> a - b;
		System.out.println("Subtraction: "+subtraction.operation(65, 30));

		//with return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> { return a * b; };
		System.out.println("Multiplication: "+multiplication.operation(45, 2));
		
		//without return statement and without curly braces
		MathOperation division = (int a, int b) -> a / b;
		System.out.println("Division: "+division.operation(75, 3));
		
		// Without parenthesis
        GreetingService greetService1 = message ->
        System.out.println("\nHello " + message);
         
        //With parenthesis
        GreetingService greetService2 = (message) ->
        System.out.println("Hello " + message);
         
        greetService1.sayMessage("Mike");
        greetService2.sayMessage("John");

	}

}
