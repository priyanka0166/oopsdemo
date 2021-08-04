package miscellaneous;

public class StringDemo {
	

	private String firstString = "This is a new String";
	private String secondString = "This is a new String";
	private String concatString;
	private String replacedString;

	private boolean equal;
	    
	void test() {
	   equal = firstString.equals(secondString);
	   concatString = "The appendage will come behind me "
	                      .concat(secondString);
	   replacedString = firstString.replace('i', 'z');
	}

	void print() {
	   System.out.println("The concatenated value: " + concatString);
	   System.out.println("Replacing i's with z's: " + replacedString);

	   if (equal) {
	      System.out.println("The two strings are equal");
	   } 
	   else {
	      System.out.println("The strings are not equal");
	   }
	}


	public static void main(String[] args) {
			
		StringDemo s = new StringDemo();
		s.test();
		s.print();
			
		String s1 = "James Gosling";
		String email = "sen@test.com";
			
			// Position of a character
		System.out.println("Length of the string: "+s1.length());
			
		if(email.indexOf('.') > email.indexOf('@'))
			System.out.println("Valid email id");
		else
			System.out.println("Invalid email id");
		
		System.out.println(s1.concat(email));
		System.out.println(s1.substring(2, 4));
		System.out.println(s1.substring(6, s1.length()));
		
	}
}

