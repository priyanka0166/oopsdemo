package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollableDemo {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt;
		ResultSet rs;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc", "root", "priyanka");
		
			// Scrollable Result set 
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			rs = stmt.executeQuery("Select * from skills");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			}
			
			System.out.println("\n*** Display in Reverse ***");
			rs.afterLast();   // Reversing the list
			while(rs.previous())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			}
			
			System.out.println("\nDisplay 3rd Record");
			rs.absolute(3);  // move the cursor to 3rd record
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			
			System.out.println("\nDisplay 2nd Record using Relative");
			rs.relative(-1);  // move the cursor to 2nd record (relative- retrieves data from current position)
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			
			System.out.println("\nDisplay 1st and last Record ");
			rs.first();
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			rs.last();
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			
			rs.absolute(5);
			System.out.println("\nCurrent Cursor position: "+rs.getRow());
			System.out.println("Total no. of Records: "+rs.getRow());
			
			con.close();
		}
		
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
