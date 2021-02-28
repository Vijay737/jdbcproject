package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class demotest {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 st values");
		int a=sc.nextInt();
		System.out.println("enter 2nd values");
		String b=sc.next();
		System.out.println("enter 3rd values");
		String c=sc.next();
		
		try {
		Class.forName("com.mysql.jdbc.Driver");//driver load
		System.out.println("Connected");	

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");//for making connection
		System.out.println("3333");
		PreparedStatement stm=con.prepareStatement("insert into demo values (?,?,?)");
		
		stm.setInt(1, a);
	
		stm.setString(2, b);
		System.out.println("444");
		stm.setString(3, c);
		int c1=stm.executeUpdate();
		System.out.println( "12125");
		System.out.println(c1);
		stm.close();
		con.close();
		
		
		
		}catch(Exception e) {
			
			System.out.println("missing");
			
		}
		
		
	}

}
