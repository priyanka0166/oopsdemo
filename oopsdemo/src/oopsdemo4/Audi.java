package oopsdemo4;

public class Audi implements NewCarModel {
	
	Car c = new Car("Audi", true, "A5.0", 5.2f, "Black", "Disel", "280bhp", 6);
	
	public void CarFeatures()
	 {
		System.out.println("Brand Name : "+ c.getCompany());
		System.out.println("Color of Car : "+ c.getColor());
		System.out.println("Power : "+ c.getPower());
		System.out.println("Fuel type : "+ c.getFuelType());	
		System.out.println("No of Gears: " + c.getNumberOfGear());
	 }

	@Override
	public void isAutomatic() {
		System.out.println("Is this Car automatic : " + c.isAutomatic());

	}

	@Override
	public void modelName() {
		System.out.println("Model name : " + c.getModelName());

	}

	@Override
	public void highTechAC() {
		System.out.println("Ac Spec: " + c.getHighTechAC());

	}

}
