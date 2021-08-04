package oopsdemo2;

public class SavingsBank extends Account {

	private int min_bal;   // can access only within the class
	protected int balance;  // can access only within the class and subclass
	
	public SavingsBank(int accNo, String name, int mb, int b) {
		super(accNo, name);
		this.min_bal = mb;
		this.balance = b;
		
	}
	
	void display()
    {
            super.display();  // calls the base class method --> Account 
            System.out.println ("Minimum Balance: "+ min_bal);
            System.out.println ("Saving Balance: "+ balance);
    }

}
