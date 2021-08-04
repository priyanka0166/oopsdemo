package exceptionsdemo;
import java.util.Scanner;
// Normal code for division but / by zero gives an exception
// DivisionDemo
public class Division {

	public static void main(String[] args) {
		
		/*int a, b, result;  
        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");
        a = input.nextInt();
        b = input.nextInt();  
        result = a / b;  
        System.out.println("Result = " + result);
        
        input.close();*/
		
		try {
			System.out.println("H"+ " "+1/0);
		}
		catch (ArithmeticException e) {
			System.out.println("W");
		}

	}

}
