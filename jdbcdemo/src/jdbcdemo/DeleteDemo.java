package jdbcdemo;
import java.sql.*;
public class DeleteDemo {

	public static void main(String[] args) {
		Connection con;
        Statement smt;
        int cnt=0;
        
        try {
    		con = ConnectionUtil.createConnection();
    		String sql = "Delete from candidates where rtrim(last_name) LIKE \'K%g\';";
    		
    		String sql1 = "Delete from candidates where id=101;";
    		
    		smt = con.createStatement();
    		cnt = smt.executeUpdate(sql1);
    		
    		if(cnt>0) 
				System.out.println(cnt+" Records Successfully Deleted");
    		else
    			System.out.println("Record not Found");
    		
    		con.close();
    	}
        catch (Exception e) {
			System.out.println(e);
		}

	}

}
