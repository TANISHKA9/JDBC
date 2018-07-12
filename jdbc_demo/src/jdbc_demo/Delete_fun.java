package jdbc_demo;

import java.sql.*;
import java.util.Scanner;

public class Delete_fun {
	static void delete(Statement st) throws SQLException 
    {
        System.out.println("Please provide the Id of student you want to delete from records:");
        Scanner sc=new Scanner(System.in);
        int id =sc.nextInt();
        
        String query;
        query = "Delete from Student where id ="+id;
        int count=st.executeUpdate(query);
        System.out.println(count+ " Record deleted from table student!");
        sc.close();
    }
    
}
