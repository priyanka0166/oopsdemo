package miscellaneous;

public class WrapperDemo {

	public static void main(String[] args) {
		
		// Create primitive types
		int a = 5;
		float b = 10.10f;
		
		// convert into wrapper objects - Auto boxing
		Integer aObj = a;
		Float bObj = b;
		
		//Create wrapper class Object
		Integer x = Integer.valueOf(100);
		Double y = Double.valueOf(200.25);
		
		// convert into primitive types
		// Auto Unboxing -- Converting obj to value type
		int p = x.intValue();
		double q = y.doubleValue();
		
		System.out.println(p +" "+q);
		System.out.println(aObj +" "+ bObj );
		
		char e = 'a';
		Character obj = e;
		System.out.println(obj);
		System.out.println(Character.isUpperCase(e));
		
		Double d = 2.1;
		Double obj1 = Double.valueOf(d);
		System.out.println(obj1);
		System.out.println(Double.toHexString(d));
		
		System.out.println(Integer.toHexString(15));
		
		String hex = "0xaa";
		String oct = "005";
		
		System.out.println(Integer.decode(hex));
		System.out.println(Integer.decode(oct));

	}

}
