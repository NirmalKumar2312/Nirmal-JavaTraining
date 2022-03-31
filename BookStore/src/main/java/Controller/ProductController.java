package Controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.ProductClass;

public class ProductController {
	public List<ProductClass> findallProducts() throws ClassNotFoundException, SQLException{
		List<ProductClass> productList=new ArrayList<ProductClass>();
		String query="Select * from dummy1";
		
		ResultSet resultset;
		 resultset=JdbcConnectionClass.getResultSet(query);
		while(resultset.next()) {
			System.out.println(resultset.getInt("id")+"\t\t"+resultset.getInt("age")+"\t\t"+resultset.getInt("phone_no")+"\t\t"+resultset.getFloat("salary")+"\t\t"+resultset.getString("gender"));
			
		}
		return productList;
	}
	public int save() throws ClassNotFoundException, SQLException {
		String query="insert into dummy1(id,,age,phone_no,salary,gender)values(?,?,?,?,?)";
		int rows_inserted=0;
		   try {
			   rows_inserted=JdbcConnectionClass.saveRecord(query);
		   }
		   catch (ClassNotFoundException | SQLException e )
		   {
			    e.printStackTrace();
		   }
		   return rows_inserted;

		   
	}
	public void update() {
		String query=("update dummy1 set age=? where gender=?");
		int rows_updated=0;
		   try {
			   rows_updated=JdbcConnectionClass.modifyRecord(query);
		   }
		   catch (ClassNotFoundException | SQLException e )
		   {
			    e.printStackTrace();
		   }
	}
	

}
