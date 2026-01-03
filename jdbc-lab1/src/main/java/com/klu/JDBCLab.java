package com.klu;
import java.sql.*;
import java.sql.DriverManager;
public class JDBCLab 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306/fsadS52";
		String usr="root";
		String pwd="Ssp@2006";
		try
		{
			  Connection con = DriverManager.getConnection(url,usr,pwd);
		      System.out.println("Connection established");
		      Statement st = con.createStatement();
		      String dept  = "create table if not exists Department("+"dept_id int primary key,"+"dept_name varchar(50)"+")";
		      st.executeUpdate(dept);
		      System.out.println("Department table created");
		      String emp  = "create table if not exists Employee("+"emp_id int primary key,"+"emp_name varchar(50),"+"salary DOUBLE,"+"dept_id INT,"+"FOREIGN KEY(dept_id)REFERENCES department(dept_id) "+")";
		      st.executeUpdate(emp);
		      System.out.println("Employee table created");
		      st.executeUpdate("INSERT INTO Department VALUES (1,'HR'),(2,'Finance')");
		      st.executeUpdate("INSERT INTO Employee VALUES (51,'Alice',25000,1),(52,'Bob',50000,1),(53,'Charles',60000,2)");
		      con.close();
		      st.close();
		}
		catch(Exception e)
	    {
	      e.printStackTrace();
	    }
	}
}
