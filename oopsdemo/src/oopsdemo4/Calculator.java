package oopsdemo4;

import java.util.Scanner;

public class Calculator implements IMath {
	
	Scanner sc;

	@Override
	public void add() {
		sc = new Scanner(System.in);
		
        System.out.println("Enter any two integer values to perform Addition ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);

	}

	@Override
	public void sub() {
		sc = new Scanner(System.in);
		
        System.out.println("Enter any two integer values to perform Substraction ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = a-b;
        System.out.println("Substraction of "+a+" and "+b+" is "+s);

	}

	@Override
	public void mul() {
		sc = new Scanner(System.in);
		
        System.out.println("Enter any two integer values to perform Multiplication ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = a*b;
        System.out.println("Multiplication of "+a+" and "+b+" is "+s);

	}

	@Override
	public void div() {
		sc = new Scanner(System.in);
		
        System.out.println("Enter any two integer values to perform Division ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = a/b;
        System.out.println("Division of "+a+" and "+b+" is "+s);

	}

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();

	}

}
