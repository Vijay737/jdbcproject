package jdbc;

import java.sql.DriverManager;

import java.sql.*;

public class v {

	public static void main(String[] args) throws Exception
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");//driver load
		System.out.println("Connected");	

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");//for making connection
		//System.out.println("3333");
		Statement stmt=con.createStatement();
		System.out.println("3533");
		//ResultSet rs =stmt.executeQuery("select *from emp");
		int count =stmt.executeUpdate("CREATE TABLE demo( id INT NOT NULL,name VARCHAR(12),phone VARCHAR(12) )");
		System.out.println("3363");
		/*
		 * while(rs.next()) { System.out.println(rs.getInt(1)+" "+rs.getString(2)); }
		 */
		System.out.println(count);

		stmt.close();
		con.close();
		
	}
		catch(Exception e)
		{
			System.out.print("Excepto");
		}

}
}