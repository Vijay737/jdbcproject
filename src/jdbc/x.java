package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class x {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id");
	int a=sc.nextInt();
	System.out.println("enter name");
	String b=sc.next();
	System.out.println("enter age");
	int c=sc.nextInt();
	System.out.println("enter dept");
	String d=sc.next();
	System.out.println("enter city");
	String bb=sc.next();
	System.out.println("enter salary");
	int e=sc.nextInt();
	try {
	Class.forName("com.mysql.jdbc.Driver");//driver load
	System.out.println("Connected");	
    System.out.println("1");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");//for making connection
	System.out.println("2");
	PreparedStatement stm=con.prepareStatement("insert into emp values(?,?,?,?,?,?)");
	stm.setLong(1, a);
	stm.setString(2, b);
	stm.setLong(3, c);
	stm.setString(4, d);
	stm.setString(5, bb);
	stm.setLong(6, e);
	
	int count=stm.executeUpdate();
	System.out.println(count);
	stm.close();
	con.close();
	
} catch(Exception e1) {
	
	
	System.out.println("error found");
	
}
	
}

}
