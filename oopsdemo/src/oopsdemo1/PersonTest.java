package oopsdemo1;

import java.util.Scanner;

class Person
{
	String name, constituency;
	int age;
	Scanner s;
	
	// Default Constructor
	public Person() {
		
		System.out.println("Voter Eligibility App ");
		age = 0;
		name = "";
		constituency = "Bengaluru";
		 s= new Scanner(System.in);
	}

	// Parameterized Constructor 
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		constituency = "Mumbai";
		
	}
	
	public Person(String n, int a, String c)
	{
		name = n;
		age = a;
		constituency = c;
	}
	
	void input() {
		System.out.println("Enter Name: ");
		name = s.nextLine();
		System.out.println("Enter Age: ");
		age = s.nextInt();
			
	}
	
	void print() {
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
		System.out.println("Constituency is "+ constituency);
	}
	
			
}

public class PersonTest {

	public static void main(String[] args) {
		
		// invokes implicit constructor
		Person objP1 = new Person();
		objP1.input();
		objP1.print();
		
		System.out.println("------------------------");
		
		// invokes constructor with two arguments
		Person objP2 = new Person("Ojo Sam Speedy", 29);
		objP2.print();
		
		System.out.println("------------------------");
		
		Person objP3 = new Person("Hamzy", 25, "South Korea");
		objP3.print();
		

	}

}
