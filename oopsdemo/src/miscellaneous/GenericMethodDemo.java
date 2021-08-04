package miscellaneous;

public class GenericMethodDemo {
	
	public static <E> void printArray(E[] inputArray)
	{
		for(E element: inputArray)
		System.out.println(element);
	}

	public static void main(String[] args) {
		
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
		Character[] charArray = {'H', 'E','L','L','O'};
		
		System.out.println("Array integerArray: ");
		printArray(intArray);
		
		System.out.println("\nArray doubleArray: ");
		printArray(doubleArray);
		
		System.out.println("\nArray charArray: ");
		printArray(charArray); 

	}

}
