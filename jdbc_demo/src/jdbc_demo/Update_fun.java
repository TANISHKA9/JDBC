package jdbc_demo;

import java.sql.Statement;
import java.util.Scanner;

public class Update_fun {
	public static void update(Statement st) throws Exception
    {
        String query;
        System.out.println("Enter Student Id to update records:");
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        int id=sc.nextInt();
        System.out.println("Please enter new name for student with id "+id);
        String name;
        name = sc2.next();
        
        query = "Update Student SET name='"+name+"' where id="+id;
       
            int count=st.executeUpdate(query);
            
            System.out.println(count+ " Record updated from table student!");
            sc.close();
            sc2.close();
    }
    

}
