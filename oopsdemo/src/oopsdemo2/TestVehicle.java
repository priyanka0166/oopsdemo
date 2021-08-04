package oopsdemo2;
// Dynamic Polymorphism
public class TestVehicle {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		v.drive();
		
		Vehicle vc = new Carr();           // Upcasting
		vc.drive();              //Overridden drive method of Car class
		
		Vehicle vt = new Truck();       // Upcasting
		vt.drive();  		//Overridden drive method of Truck class
							// vt.load();     Compile time error
		
		Truck t = new Truck();
		t.load();
		
		

	}

}
