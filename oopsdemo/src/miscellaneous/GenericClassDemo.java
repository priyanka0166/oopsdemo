package miscellaneous;

class Sample<T>           // Parameterized or Generic class
{
	private T data;       // Generic variable declaration

	public Sample(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}

public class GenericClassDemo {

	public static void main(String[] args) {
		
		// Object of Generic class of type string
		Sample<String> s1 = new Sample<String>("Java Generics");
		
		System.out.println("Display from generic class by "
				+ "passing string object: "+ s1.getData());
		
		Sample<Integer> s2 = new Sample<Integer>(500);
		
		// Object of Generic class of type integer
		System.out.println("Display from generic class by "
				+ "passing integer object: "+ s2.getData());
		
		// Object of Generic class of type double
		Sample<Double> s3 = new Sample<Double>(125.24);
		
		System.out.println("Display from generic class by "
				+ "passing double object: "+ s3.getData());

	}

}
