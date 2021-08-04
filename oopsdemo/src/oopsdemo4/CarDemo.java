package oopsdemo4;

public class CarDemo {

	public static void main(String[] args) {
		
		System.out.println("Details of Maruti Cars: ");
		Maruti m = new Maruti();
		m.CarFeatures();
		m.isAutomatic();
		m.highTechAC();
		m.modelName();
		
		System.out.println("---------------------------------");
		
		System.out.println("Details of Audi Cars: ");
		Audi a = new Audi();
		a.CarFeatures();
		a.isAutomatic();
		a.highTechAC();
		a.modelName();

	}

}
