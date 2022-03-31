package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCconnection {

	public static void main(String[] args) throws SQLException {
		Scanner scan=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/dummy";
		String username="root";
		String password="8610801905";
		String query="select * from Product_data";
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
		System.out.println(rs.getInt("Product_id")+"\t"+rs.getString("Product_name")+"\t"+rs.getDate("Manufactured_Date")
		+"\t"+rs.getInt("Stock_Available")+"\t"+rs.getFloat("Price"));	
		}
		String query1="insert into product_details(Product_id, Product_name,Manufactured_Date,Stock_Available,Price) values (?,?,?,?,?)";
		PreparedStatement pt=con.prepareStatement(query1);
		System.out.print("\nEnter the product id       :");
		int s1=scan.nextInt();
		System.out.print("\nEnter the product name     :");
		String s2=scan.next();
		System.out.print("\nEnter the Manufactured date:");
		String s3=scan.next();
		System.out.print("\nEnter the Stock Available  :");
		int s4=scan.nextInt();	
		System.out.print("\nEnter the Price            :");
		int s5=scan.nextInt();
		pt.setInt(1, s1);
		pt.setString(2, s2);
		pt.setString(3, s3);
		pt.setInt(4, s4);
		pt.setInt(5, s5);
		int pst=pt.executeUpdate();
		ResultSet rs1=st.executeQuery(query);
		while(rs1.next())
		{
		System.out.println(rs1.getInt("Product_id")+"\t"+rs1.getString("Product_name")+"\t"+rs1.getDate("Manufactured_Date")
		+"\t"+rs1.getInt("Stock_Available")+"\t"+rs1.getFloat("Price"));
			
		}
		st.close();
		con.close();
		scan.close();
	}
}