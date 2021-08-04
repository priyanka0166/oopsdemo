package miscellaneous;

import java.util.Scanner;

public class TwoPairDemo {

	public static void main(String[] args) {
		
		Pair<String, Integer> p1 = new Pair<String, Integer>("The car guys ",8);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Our Current rating for "+p1.getFirst()
			+"is: "+p1.getSecond());
		
		System.out.println("How would you rate them? ");
		int rate = sc.nextInt();
		
		p1.setSecond(rate);
		
		System.out.println("Our New rating for "+p1.getFirst()
		+"is: "+p1.getSecond());
		
		Pair<String, Float> p2 = new Pair<String, Float>("TROY ",5.87F);
				
		System.out.println("Our Current rating for "+p2.getFirst()
			+"is: "+p2.getSecond());
		
		System.out.println("How would you rate them? ");
		float rate1 = sc.nextFloat();
		
		p2.setSecond(rate1);
		
		System.out.println("Our New rating for "+p2.getFirst()
		+"is: "+p2.getSecond());
		
		

	}

}
