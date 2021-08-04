package exceptionsdemo;

public class ThrowExample {
	
	public static void checkEligibility(int age, int weight) {
		if(age<12 && weight<40)
			throw new ArithmeticException("Student not Eligible for Registration");
		else
			System.out.println("Student with age "+age+" and weight "+weight+" is eligible" );
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to Sports Eligibility Process");
		checkEligibility(20,45);
		System.out.println("\nThank You!");
		checkEligibility(10,39);

	}

}
