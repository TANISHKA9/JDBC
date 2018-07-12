package jdbc_demo;

import java.sql.*;

public class Db_connection {
	
	public static Statement connection() throws Exception
    {
		Class.forName("oracle.jdbc.OracleDriver");
        String URL=new String("jdbc:oracle:thin:@localhost:1521:orcl");
        String uname=new String("System");
        String pass=new String("Suvarndeep9");
        Connection con=DriverManager.getConnection(URL, uname, pass);
        
        Statement st=con.createStatement();
        return st;
    }    

}
