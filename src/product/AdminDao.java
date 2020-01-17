package product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import daompl.productimp;
public class AdminDao extends ConnectionManager implements productimp {
public boolean save(Admin a)
		{
			String sql="insert into Admin(ProductId,ProductName,Price,QuantityAvailable,TotalCost)values(?,?,?,?,?)";
			try{
		    PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(sql);
			ps.setString(1,a.getProductId());
			ps.setString(2,a.getProductName());
			ps.setFloat(3,(float) a.getPrice());
			ps.setInt(4,a.getQuantityAvailable());
			ps.setFloat(5,(float) a.getTotalCost());
			
			int resultset=ps.executeUpdate();
			if(resultset==1) {
				ConnectionManager.getConnection().close();
			
		       return true;
			}
			else
				return false;
		}catch(SQLException e)
			{
			e.printStackTrace();
			}
			return false;
		}

		

		@Override
		public List<Admin> displayAllAdmin() {
			String Sql="Select * from Admin";
			List<Admin> list1=new LinkedList<Admin>();
			try {
				 PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(Sql);
				 ResultSet rs=ps.executeQuery();
				 while(rs.next())
				 {
					 Admin a=new Admin();
					 a.setProductId(rs.getString("ProductId"));
					 a.setProductName(rs.getString("ProductName"));
					 a.setPrice(rs.getFloat("Price"));
					 a.setQuantityAvailable(rs.getInt("QuantityAvailable"));
					 a.setTotalCost(rs.getFloat("TotalCost"));
					 list1.add(a);
					 
			    }
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return list1;
		}}

