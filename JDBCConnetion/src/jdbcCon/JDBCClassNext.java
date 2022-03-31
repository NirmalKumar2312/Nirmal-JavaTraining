package jdbcCon;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.sql.PreparedStatement;

public class JDBCClassNext { 
	public static PreparedStatement pst;
		int id;
		String address;
	public void insert() throws SQLException
	{
		Scanner sa=new Scanner(System.in);
		
		
		System.out.println("id");
		id=sa.nextInt();
		System.out.println("address");
		address=sa.next();
		pst.setInt(1,id);
		pst.setString(2,address);
	}

	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		// TODO Auto-generated method stub
		Scanner sa=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dummy","root","8610801905");
		Statement st=con.createStatement();
		JDBCClassNext obj=new JDBCClassNext();
		System.out.println("1=insert    2=delete");
		int a=sa.nextInt();
		switch (a)
		{
			case 1:	
			{
				pst=con.prepareStatement("insert into dummy2(id,address)values(?,?)");
				obj.insert();
				int rows_affected=pst.executeUpdate();
			

				ResultSet rs=st.executeQuery("select * from dummy2");
				while(rs.next())
				{
				System.out.println(rs.getInt("id")+"\t"+rs.getString("address"));
				}
				break;
			}
			case 2:
			{
				PreparedStatement pst=con.prepareStatement("delete from dummy2 where id=?");
				int id;
				System.out.println("id");
				id=sa.nextInt();
				int rows_deleted=pst.executeUpdate();
				ResultSet rs=st.executeQuery("select * from dummy2");
				while(rs.next())
				{
				System.out.println(rs.getInt("id")+"\t"+rs.getString("address"));
				
				}
				break;
		}
	}		
}

}
