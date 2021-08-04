package newfeatures;
//EmployeeTest Employee
import java.util.Arrays;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] emp = { 
				new Employee("David"),
				new Employee("Naveen"),
				new Employee("Alex"),
				new Employee("Richard")
		};
		System.out.println("Before Sorting Names: "+Arrays.toString(emp));
		
		Arrays.sort(emp, Employee::nameCompare);
		System.out.println("After Sorting Names: "+Arrays.toString(emp));

	}

}
