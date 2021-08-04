package oopsdemo1;

public class ThisDemo {
	
	int age;
	
	ThisDemo(int age)
	{
		age = age;
	}

	public static void main(String[] args) {
		
		ThisDemo td1 = new ThisDemo(22);
		System.out.println("The age is  "+ td1.age);

	}

}
