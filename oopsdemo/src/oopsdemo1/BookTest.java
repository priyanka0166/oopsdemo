package oopsdemo1;

public class BookTest {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.setBookId(10001);
		b1.setBookName("C Programming");
		b1.setPrice(500);
		b1.setPublisher("Prime Book");
		
		System.out.println("*********Book Dtails**********");
		System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+ b1.getPrice()+" "+ b1.getPublisher());
		
		System.out.println(b1);
		
				

	}

}
