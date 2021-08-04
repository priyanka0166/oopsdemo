package oopsdemo2;

/* Multi-level Inheritance
 *  Account  --- > SavingsBank ---> AccountDetails
 */

public class AccountDetails extends SavingsBank{  
	
	int withdrawal, deposit, finalBal;

	public AccountDetails(int accNo, String name, int mb, int b, int w, int dep) {
		super(accNo, name, mb, b);
		this.withdrawal = w;
		this.deposit = dep;
				
	}
	
	void display()
    {
            super.display();     // savingBanks display() method
            System.out.println ("Deposits: "+deposit);
            System.out.println ("Withdrawals: "+withdrawal);
            
            finalBal = (balance+deposit) - withdrawal;
            System.out.println("Total Balance: "+finalBal );
    }

}
