package jdbc_demo;

import java.sql.*;

public class Select_fun {
	 static void select(Statement st) throws SQLException {
	       String query=new String("Select * from Student");
	        ResultSet rs=st.executeQuery(query);
	        System.out.println(" Table Student:");
	        while(rs.next())
	        {
	            System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+ " "+ rs.getInt(3));
	        }
	    }
	    
}
