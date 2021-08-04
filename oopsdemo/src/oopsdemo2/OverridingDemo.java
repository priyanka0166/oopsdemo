package oopsdemo2;
// Methods are same but action performed is different
class Bank
{
	int getRateofInterest()
	{
		return 0;
	}
	// Common for all
	void display()
	{
		System.out.println("Welcome to Bank");
	}
}

class SBI extends Bank
{
	int getRateofInterest()     // Overridden Method
	{
		return 5;
	}
}

class ICICI extends Bank
{
	int getRateofInterest()     // Overridden Method in child class
	{
		return 7;
	}
}

class Axis extends Bank
{
	int getRateofInterest()     // Overridden Method
	{
		return 6;
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		SBI b1 = new SBI();
		ICICI b2 = new ICICI();
		Axis b3 = new Axis();
		
		b1.display();
		System.out.println("The interest rate of SBI Bank is "+b1.getRateofInterest());
		System.out.println("The interest rate of ICICI Bank is "+b2.getRateofInterest());
		System.out.println("The interest rate of Axis Bank is "+b3.getRateofInterest());

	}

}
