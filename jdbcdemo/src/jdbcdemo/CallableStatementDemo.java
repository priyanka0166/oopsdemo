package jdbcdemo;
import java.sql.*;
import java.util.Scanner;

class Skills {
	Connection con;
    CallableStatement csmt;
    ResultSet rs;
    
	public Skills() throws Exception {
		con = ConnectionUtil.createConnection();
	}
    
    public void getSkills(int candidateId ) throws Exception {
    	csmt = con.prepareCall("{call get_candidate_skill(?)}");
    	csmt.setInt(1, candidateId);
    	rs = csmt.executeQuery();
    	
    	while (rs.next()) {
            System.out.println(String.format("%s - %s",
                    rs.getString("first_name") + " "
                    + rs.getString("last_name"),
                    rs.getString("skill")));
    }
}

public class CallableStatementDemo {

	public static void main(String[] args) {

		try {
			Skills s = new Skills();
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Candidate Id: ");
			int id = sc.nextInt();

			s.getSkills(id);
			sc.close();
		} 
		catch (Exception e) {

			e.printStackTrace();
		}
    	
    	
    	
	}

}
