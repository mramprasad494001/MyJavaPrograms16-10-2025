package my_jdbc_first_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		// userName MYSQL =  userName , userPassword //  isse me MYSQL me login ho sakta hu [userName = root, userPassword = root]
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
		
//		[] perenthisis
		
		/*
		String name = "Balvant";
		String email = "balvant@gmail.com";
		String userName = "balvant@123";
		String gender = "male";
		String city = "puspal";
		
		
		
		// yha per query dalna hoga
		PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, userName);
		ps.setString(4, gender);
		ps.setString(5, city);
		
		*/
		String name = "Balvant";
		String city  = "bilaspur";
		
		// yha per update kaise kar sakte hai 
		PreparedStatement ps = con.prepareStatement("update register set city=? where name=?");
		ps.setString(1, city);
		ps.setString(2, name);
		
		int i = ps.executeUpdate();
		// personName , emaill , userName , gender , city
		// deepak , deepak@gmail.com, ram@123, male, chandigarh
		
		if(i > 0) {
			System.out.println("stored successfull");
		}else {
			System.out.println("failed !!");
		}
		
	}
}
