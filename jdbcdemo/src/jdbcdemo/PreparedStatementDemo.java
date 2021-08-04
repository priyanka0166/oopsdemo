package jdbcdemo;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		
		Connection con;
		PreparedStatement psmt;
		ResultSet rs;
		Scanner sc;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "priyanka");
			psmt = con.prepareStatement("Select customerNumber, customerName, city, country"
					+ " from customers where country=? ");
			
			sc = new Scanner(System.in);
			System.out.println("Enter country name of the customers to be displayed: ");
			String country = sc.next();
			
			// assign value for to i/p parameter of preStatement
			psmt.setString(1, country);
			
			rs = psmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t "+rs.getString(2)+"  \t "+rs.getString(3)+"\t"+rs.getString(4));
			}
			
			System.out.println("\n--------------------------------------------\n");
			
			System.out.println("Enter country name of the customers to be displayed: ");
			String country1 = sc.next();
			
			// Reuse of preStatement
			psmt.setString(1, country1);
			
			rs = psmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t "+rs.getString(2)+"  \t "+rs.getString(3)+"\t"+rs.getString(4));
			}
			
			con.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
