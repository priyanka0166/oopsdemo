package oopsdemo4;
// Multiple Interface implementation

public class StudentDetails implements CollegeData,HostelData {
	
	College c1 = new College("Mary", 500, "Joseph University", "MCA");
	
	Hostel h1 = new Hostel("Sam", "Block A");

	@Override
	public void hostelDetail() {
		System.out.println("--------- Hostel Details ----------");
		System.out.println("Hostel Name: "+h1.getName());
		System.out.println("Location: "+h1.getLocation());
	}

	@Override
	public void studentRecord() {
		System.out.println("Students selected based on percentage & Financial Situation");		
	}

	@Override
	public void collegeDetail() {
		System.out.println("--------- College Details ----------");
		System.out.println("College Name: "+c1.getName());
		System.out.println("College Id: "+c1.getId());
		System.out.println("Course: "+c1.getCourse());
		System.out.println("University: "+c1.getUniversity());
	}

	@Override
	public void studentData() {
		System.out.println("Students can join courses: MCA, MTech, BCA, BTech ");		
	}
	
	public static void main(String[] args) {
		
		StudentDetails s1 = new StudentDetails();
		
		s1.collegeDetail();
		s1.studentData();
		s1.hostelDetail();
		s1.studentRecord();

	}
}
