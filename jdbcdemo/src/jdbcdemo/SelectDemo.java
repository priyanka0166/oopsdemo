package jdbcdemo;

import java.sql.*;

public class SelectDemo {

	public static void main(String[] args) {

		Connection con;
		Statement stmt;
		ResultSet rs;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc", "root", "priyanka");
			stmt = con.createStatement();
			
			rs = stmt.executeQuery("Select first_name, last_name, email from candidates ");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+ rs.getString("last_name")+"\t\t"+rs.getString("email")+"\n");
			}
			
			con.close();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}
}
