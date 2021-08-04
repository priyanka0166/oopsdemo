package collectionsdemo;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("Alpha");
		str.add("Beta");
		System.out.println(str);
		
		for(int i=0;i<str.size();i++)
		{
			String str1 = str.get(i);
			System.out.println(str1);
		}
		
		str.add("Gamma");
		System.out.println(str);

	}

}
