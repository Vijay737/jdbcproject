package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class stu {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String b=sc.next();
		String c=sc.next();
		
		
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");//driver load
			System.out.println("Connected");	

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");//for making connection
			PreparedStatement stm=con.prepareStatement("insert into stm values=(?,?,?)");
			System.out.println("bxd");
			stm.setLong(1, a);
			stm.setString(2,b);
			stm.setString(3, c);
			int c1=stm.executeUpdate();
			System.out.println(c1);
			stm.close();
			con.close();
			
		
			
			
		}
			
		catch(Exception e) {
			
			System.out.println("something missing");
			
		}	
			
			
			
	}
	}
	