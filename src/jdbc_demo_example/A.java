package jdbc_demo_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class A {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_z","root","Kanpur");
			
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("Delete from registration where email='smith@gmail.com'");
			con.close();
			System.out.println(con);
			
					
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
