package jdbcdemo;
import java.sql.*;

public class Employee {
	Connection con = null;
	PreparedStatement ps;
	Statement smt;
	ResultSet rs;
	int cnt = 0;

	public static Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "priyanka");
		return con;
	}


	public void insertEmployee(String name, String city, String contact) throws Exception
	{
		try {
			con = getConnection();
			System.out.println("--- Insert new Employees ---");
			
			String sqlInsert = "INSERT INTO EmployeeDetails (NAME, City, Contact) VALUES (?, ?, ?);	";
			ps = con.prepareStatement(sqlInsert); 

			ps.setString(1, name);
			ps.setString(2, city);
			ps.setString(3, contact);
			
			cnt = ps.executeUpdate();
	        System.out.println(String.format("%d Row affected.", cnt));
	        
	        System.out.println();
		}
		catch (Exception ex) {
			System.out.println(ex);
		}

	}

	public void getEmployee() throws Exception
	{
		try {
			con = getConnection();
			System.out.println("\n--- Display Employees ---\n");			
			smt = con.createStatement();

			rs = smt.executeQuery("SELECT * FROM EmployeeDetails;"); 

			while(rs.next())  {
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+" \t"+rs.getString(3)+"\t"+rs.getString(4));
			}
			System.out.println();
		}
		catch (Exception ex) {
			System.out.println(ex);
		}

	}

	public void updateEmployee(int cid,String city) throws Exception
	{
		try {
			con = getConnection();
			System.out.println("\n--- Update Employees ---");
			String sqlUpdate= "UPDATE EmployeeDetails SET city = ? WHERE EmpId = ?; ";
			ps = con.prepareStatement(sqlUpdate);
			
			ps.setString(1, city);
			ps.setInt(2,cid);
			
			
			cnt = ps.executeUpdate();
	        System.out.println(String.format("%d Row affected.", cnt));
	        
			System.out.println();
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
	}


	public void deleteEmployee(int cid) throws Exception
	{
		try {
			con = getConnection();
			System.out.println("\n--- Delete Employees ---\n");
			String sqlDelete = "DELETE FROM EmployeeDetails WHERE EmpId = ? ; ";
			ps = con.prepareStatement(sqlDelete);
			
			ps.setInt(1, cid);

			cnt = ps.executeUpdate();
	        System.out.println(String.format("%d Row affected.", cnt));
	        
			System.out.println();
		}
		catch (Exception ex) {
			System.out.println(ex);

		}
	}
}

