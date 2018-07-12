package jdbc_demo;

import java.sql.*;
import java.util.Scanner;

public class Insert_fun {
	public static void insert(Statement st) throws SQLException
    {
            int id;
            String name;
            int age;
        System.out.println("Enter Student ID to insert:");
        Scanner sc=new Scanner(System.in);
        id=sc.nextInt();
        System.out.println("Enter Student Name to insert:");
        name=sc.next();       
        System.out.println("Enter age of Student:");
        age=sc.nextInt();
        
        String query="Insert into Student values ("+id+", '"+name+"',"+age+")";
        int count=st.executeUpdate(query);
        System.out.println(count+ " Record inserted into table student!");
        sc.close();
    }

}
