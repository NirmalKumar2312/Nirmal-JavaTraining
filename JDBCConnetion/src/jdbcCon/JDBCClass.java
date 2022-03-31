package jdbcCon;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.security.Timestamp;
import java.sql.*;

public class JDBCClass {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/dummy";
		String username="root";
		String password="8610801905";
		String query="select * from dummy1";
		String query1="select * from dummy2";
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		ResultSet rs1=st.executeQuery(query1);
		int id;
		int phone_no;
		while(rs.next())
		{
			id=rs.getInt("id");
		phone_no=rs.getInt("phone_no");
		System.out.println(id+" "+" "+phone_no);
		}
		rs.close();
		int id1;
		while(rs1.next())
		{
			id1=rs1.getInt("id");
		System.out.println(id1);
		}
		rs1.close();
		st.close();
		con.close();
		
	}

}
