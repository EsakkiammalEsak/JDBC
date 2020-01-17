
package product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import daompl.Agentimp;


public class AgentDao extends ConnectionManager implements Agentimp {
	
public boolean save(Agent a1)
			{
				String sql="insert into Agent(ProductID,ProductName,Price,QuantityAvailable,BuyorSell,Quantity,TotalCost)values(?,?,?,?,?,?,?)";
				try{
			    PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(sql);
				ps.setString(1,a1.getProductID());
				ps.setString(2,a1.getProductName());
				ps.setFloat(3,(float) a1.getPrice());
				ps.setInt(4,a1.getQuantityAvailable());
				ps.setString(5,a1.getBuyorSell());
				ps.setInt(6,a1.getQuantity());
				ps.setFloat(7,(float) a1.getTotalCost());
				
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
			public List<Agent> displayAllAgent() {
				String Sql="Select * from Agent";
				List<Agent> list2=new LinkedList<Agent>();
				try {
					 PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(Sql);
					 ResultSet rs=ps.executeQuery();
					 while(rs.next())
					 {
						 Agent a1=new Agent();
						 a1.setProductID(rs.getString("ProductID"));
						 a1.setProductName(rs.getString("ProductName"));
						 a1.setPrice(rs.getFloat("Price"));
						 a1.setQuantityAvailable(rs.getInt("QuantityAvailable"));
						 a1.setBuyorSell(rs.getString("BuyorSell"));
						 a1.setQuantity(rs.getInt("Quantity"));
						 a1.setTotalCost(rs.getFloat("TotalCost"));
						 list2.add(a1);
						 
				    }
				}catch(SQLException e) {
					e.printStackTrace();
				}
				return list2;
			}

}

			



