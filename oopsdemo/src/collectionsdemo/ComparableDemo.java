package collectionsdemo;
//Student & ComparableDemo & Developer & ComparatorDemo
import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(101,"Mike",19);
		Student s2 = new Student(102,"Mike",15);
		Student s3 = new Student(103,"Mike",13);
		Student s4 = new Student(104,"Mike",10);
		Student s5 = new Student(105,"Mike",17);
		
		// adding student list
		al.add(s2); al.add(s3); al.add(s1); al.add(s4); al.add(s5); 
		
		Collections.sort(al);
		System.out.println("Student Sorted List based on Age\n");
		for(Student s:al)
		{
			System.out.println(s.rollNo+" "+s.name+" "+s.age);
		}

	}

}
