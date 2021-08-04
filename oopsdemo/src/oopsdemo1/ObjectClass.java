package oopsdemo1;

public class ObjectClass {

	public static void main(String[] args) {
		
		ObjectClass oc = new ObjectClass();
		
		Object o = new Object();
		System.out.println(o.toString());
		System.out.println(oc.hashCode());
		System.out.println(oc.toString());
		
		System.out.println(oc.getClass());
		
		ObjectClass oc1 = new ObjectClass();
		
		System.out.println(oc.equals(oc1));
		System.out.println(oc1.hashCode());
		System.out.println(oc1.toString());
		
		ObjectClass oc2 = oc;
		System.out.println(oc.equals(oc2));
		
		String s = "Java";
		String v = "Java";
		String k = new String("Java");
		
		System.out.println(s.equals(v));
		System.out.println(s.equals(k));
		System.out.println(s==k);
		System.out.println(s==v);

	}

}
