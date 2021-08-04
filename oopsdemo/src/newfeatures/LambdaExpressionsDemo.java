package newfeatures;

@FunctionalInterface  // 3FI
interface MyFunctionalInterface {
	public String sayHello();
}
interface MyFunctionalInterface1 {
	public int incrementbyFive(int a);
}
interface StringConcat {
	public String sconcat(String a, String b);
}

public class LambdaExpressionsDemo {

	public static void main(String[] args) {
		
		// Lambda Expressions with no parameter
		MyFunctionalInterface msg =()-> {return "Hello from Lambda Expressions"; };
		System.out.println(msg.sayHello());
		
		// Lambda Expressions with single parameter
		MyFunctionalInterface1 f =(num) -> num+5;
		System.out.println(f.incrementbyFive(20));
		
		// Lambda Expressions with multiple parameter
		StringConcat s = (str1,str2) -> str1+str2;
		System.out.println("\nConcat strings using Lambda Expressions");
		System.out.println(s.sconcat("Hello", " Java8" ));

	}

}
