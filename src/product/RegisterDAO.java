package product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import daompl.Register;
public class RegisterDAO extends ConnectionManager implements Register {
public boolean save(User user)
	{
		String sql="insert into users(first_name,last_name,username,password,email,mobile)values(?,?,?,?,?,?)";
		try{
	    PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(sql);
		ps.setString(1,user.getFirstname());
		ps.setString(2,user.getLastname());
		ps.setString(3,user.getUsername());
		ps.setString(4,user.getPassword());
		ps.setString(5,user.getEmail());
		ps.setString(6,user.getMobile());
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
	public List<User> displayAllUsers() {
		// TODO Auto-generated method stub
		String Sql="Select * from users";
		List<User> list=new LinkedList<User>();
		try {
			 PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(Sql);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 User user=new User();
				 user.setFirstname(rs.getString("first_name"));
				 user.setLastname(rs.getString("last_name"));
				 user.setUsername(rs.getString("username"));
				 user.setPassword(rs.getString("password"));
				 user.setEmail(rs.getString("email"));
				 user.setMobile(rs.getString("mobile"));
				 list.add(user);
				 
		    }
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
	}



