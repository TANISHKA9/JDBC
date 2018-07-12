package jdbc_demo;
import java.io.BufferedReader;
//import java.lang.*;
import java.io.InputStreamReader;
/*
 *Its a program to connect oracle d/b to java using jdbc. 
 */
import java.sql.*;
public class Jdbc_demo {

	public static void main(String[] args) throws Exception {
		
		Statement st=Db_connection.connection(); //connection creation returns object of Statement interface.
        System.out.println("Use above options for query processing:");
        int choice=100;
        do{
        System.out.println("1.Insert  2.Update  3.Delete  4.Display D/b");
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        choice=Integer.parseInt(br.readLine());
        switch(choice)
        {
            case 1: Insert_fun.insert(st);
                break;
            case 2: Update_fun.update(st);
                break;
            case 3: Delete_fun.delete(st);
                break;
            case 4: Select_fun.select(st);
                break;
            default: Runtime.getRuntime().exit(1);
        }    
        }while(choice!=0);
        
        st.close();
        
	}

}
