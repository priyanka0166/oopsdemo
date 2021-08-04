package oopsdemo2;
// Hierarchical Inheritance
class Doctor
{
	int idNumber;
	String name, address;
	
	public Doctor(int idNumber, String name, String address) {
		this.idNumber = idNumber;
		this.name = name;
		this.address = address;
	}
	
	void display() 
	{
	    System.out.println("********* Doctor Details ***********");
	    System.out.println("The name is :" + name);
	    System.out.println("The number is :" + idNumber);
	    System.out.println("The address is :" + address);
	 }
	
}

class Specialist extends Doctor
{
	String speciality;
	
	public Specialist(int idNumber, String name, String address, String sp) 
	{
		super(idNumber, name, address);   // base class constructor
		this.speciality = sp;
		
	}
	
	void display() {
	    super.display();        // call base class method
	    System.out.println("The speciality is: " + speciality);
	}
	
}

class NonSpecialist extends Doctor
{

	public NonSpecialist(int idNumber, String name, String address) {
		super(idNumber, name, address);   // base class constructor
		
	}
	
}

public class TestDoctor {

	public static void main(String[] args) {
		
		Specialist sp = new Specialist(1001, "Mary", "New York", "Cardiologist");
		
		sp.display();
		
		NonSpecialist nsp = new NonSpecialist(1005, "John", "Sydney");
		
		nsp.display();
		
		

	}

}
