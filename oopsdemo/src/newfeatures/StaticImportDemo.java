package newfeatures;

import static java.lang.System.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

import java.util.ArrayList;

// Java 5 -- Static import

public class StaticImportDemo {

	public static void main(String[] args) {
		System.out.println("Hello from Static Import");
		System.out.println(10+20);

		//instead of Math.sqrt need to use only sqrt
		double var1= sqrt(5.0);
		//instead of Math.tan need to use only tan
		double var2= tan(30);
		//need not to use System in both the below statements
		out.println("\nSquare of 5 is: "+var1);
		out.println("Tan of 30 is: "+var2);

		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(56);
		a.add(5);
		
		//need not to use Collections.___(), only method is used
		sort(a);
		out.println("\nSorted List: "+a);
		out.println("Max in List: "+max(a));
		out.println("Position of 56: "+binarySearch(a, 56));

	}

}
