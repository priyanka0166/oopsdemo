package oopsdemo3;
//  AbstractDemo
public class Marks extends Trainee {

	private double marks;
	
	public Marks(String name, String address, int number, int m) {
		super(name, address, number);
		this.marks = m;
	}

	@Override
	public double calculateMarks() {
		System.out.println("Marks: ");
		return (marks*2);
	}
	
	

}
