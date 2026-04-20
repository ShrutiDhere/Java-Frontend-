package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	
     public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	 
    	 
    	 // step 1:- Register & load Driver class 
    	 
    	 Class.forName("com.mysql.cj.jdbc.Driver");
    	 
     
     
     //step 2:- Get connection using connection(I)
     
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch426", "root", "root");

    
   //step 3 :- used Statement & PreparedStatement 
    
     Statement s= con.createStatement();
     
   // step 4 :- generate Queries  

		int checked = s.executeUpdate("insert into Student(id,name,city)values(126,'ramyam','')");

		if (checked > 0) {
			System.out.println("data inserted ... !");
		} else {
			System.out.println("data NOT inserted ... !");
		}

//  5 . close all Connection 
       }
}
