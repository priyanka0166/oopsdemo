package jdbcdemo;

import java.sql.*;

public class MYSQLConnectionDemo {

	public static void main(String[] args) {

		Connection con;
		Statement stmt;
		ResultSet rs;

		try {
			// Load & register the SQL driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Creating a connection using getConnection() of DM class
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "priyanka");

			// Creating a statement object
			stmt = con.createStatement();

			// Executing a query and storing in result set
			rs = stmt.executeQuery("Select * from Employees ");

			//Traversing result set
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+ rs.getString(3)+"\t"+rs.getString("email")+" "+rs.getString(8));
			}
			
			con.close();

		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
