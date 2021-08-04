package exceptionsdemo;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) {
		
		int a, b, result;  
        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");
        a = input.nextInt();
        b = input.nextInt(); 
        
        // statements to be monitored which may throw exception
        try {
        	result = a / b;  
            System.out.println("Result = " + result);
        }
        // exception thrown is handled in catch block
        catch(ArithmeticException e) {
        	System.out.println("Error! Divided by 0 ");
        	System.out.println("\nException Discription: "+e.getMessage());
        	System.out.println("\nException Name and Discription: "+ e.toString());
        	// Details about the exceptions details with line number
        	e.printStackTrace();
        }
        // clean up operation
        finally {
        	input.close();
        	System.out.println("\nProgram execution ended - In Finally Block");
        }

	}

}
