package oopsdemo3;

public abstract class Employee {
	
	String name, address;
	double basic;
	
	public Employee(String name, String address, double basic) {
		this.name = name;
		this.address = address;
		this.basic = basic;
	}
	
	void show() {
        System.out.println("Name: \t\t\t" + name);
        System.out.println("Address: \t\t" + address);
        System.out.println("Basic: \t\t\t" + basic);
    }
	
	double deduction(int leave) {
	      double lessPay;

	      if (leave <= 5) {
	         lessPay = (0.25 * basic);
	      } else {
	         lessPay = (0.5 * basic);
	      }
	      return lessPay;
	 }
	
	abstract double totalPay();

}
