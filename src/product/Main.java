package product;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import daompl.Agentimp;
import daompl.Register;
import daompl.productimp;


public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String firstname;
	    String lastname;
	    String username;
	    String password;
	    String confirmpassword;
	    String email;
	    String mobile;
	    
	    firstname=s.next();
	    lastname=s.next();
	    username=s.next();
	    password=s.next();
	    confirmpassword=s.next();
	    email=s.next();
	    mobile=s.next();
	    User user=new User();
	    user.setFirstname(firstname);
	    user.setLastname(lastname);
	    user.setUsername(username);
	    user.setPassword(confirmpassword);
	    user.setEmail(email);
	    user.setMobile(mobile);
	    Register register=new RegisterDAO();
	    if(register.save(user))
	    System.out.println("Data entered sucessfully");
	     else
	    System.out.println("Check your Query");
	    
	    List<User> list=register.displayAllUsers();
	    String ProductID;
	    String BuyorSell;
	    int Quantity;
	    String ProductId;
		String ProductName;
		int MinSellQuantity;
		float Price;
		int QuantityAvailable;
		float TotalCost ;
		float  TotCost=0;
		String name = null;
		float price = 0;
		int QuantityAvail = 0;
		
	      /*ProductID=s.next();
	    	BuyorSell=s.next();
	    	
	    	Quantity=s.nextInt();*/
		//ConnectionManager cm=new ConnectionManager();
		//cm.getConnection();
		while(true) {
	    System.out.println("1.Admin\t 2.Agent\t 3.Exit");
		int n=s.nextInt();
	    switch(n)
		{
		case 
		1:
			while(true)
			
			{
				ProductId=s.next();
				 ProductName=s.next();
			     MinSellQuantity=s.nextInt();
			     Price=s.nextFloat();
			      TotalCost=MinSellQuantity*Price;
			      QuantityAvailable=MinSellQuantity;
			      Admin a=new Admin();
			        a.setProductId(ProductId);
				    a.setProductName(ProductName);

				    a.setMinSellQuantity(MinSellQuantity);
				    a.setPrice(Price);
				    a.setQuantityAvailable(QuantityAvailable);
				    a.setTotalCost(TotalCost);
				 productimp    p=new AdminDao();
				    if(p.save(a))
				    System.out.println("Data entered sucessfully");
				     else
				   System.out.println("Check your Query");
				    
				List<Admin> list1=p.displayAllAdmin();
				    System.out.println("Enter Your Choice");
		    int c=s.nextInt();
			if(c==1)
			{
			a.AddProduct(ProductId,ProductName,MinSellQuantity,Price);
			break;
		
			}
			else if(c==2)
			 {
				a.Display(ProductId,ProductName,Price,QuantityAvailable,TotalCost);
			 break;
			 }
			else
			{
				System.out.println("Logout");
				break;
			}
			 
			}
			break;
			
	    case 2:
	    	System.out.println("Agent");
	    	Agent a1=new Agent();
	    	ProductID=s.next();
	    	BuyorSell=s.next();
	    	Quantity=s.nextInt();
	    	Connection connection;
	    	connection=ConnectionManager.getConnection();
	    	Statement ss=connection.createStatement();
	    	ResultSet rs= ss.executeQuery("Select * from Admin where ProductId ="+ProductID);
	    	while(rs.next())
	    	{
	    	 name =rs.getString("ProductName")	;
	    	price=rs.getFloat("Price");
	    	 QuantityAvail=rs.getInt("QuantityAvailable");
	    	
	    	if(Quantity<=QuantityAvail)
	    	{
	    		
	    		TotCost=Quantity*price;
	    		
	    	}
	    	else
	    	{
	    		System.out.println("Product is unavailable");
	    	}
	    	 
	    	}
	    	
	    	a1.setProductID(ProductID);
	    	a1.setBuyorSell(BuyorSell);
            a1.setQuantity(Quantity);
            a1.setTotCost(TotCost);
            a1.setName(name);
            a1.setPrice(price);
            a1.setQuantityAvail(QuantityAvail);
            
            System.out.println("Product is available");
	         System.out.println("TotalCost"+TotCost);
            
	    	
	    	Agentimp t   =new AgentDao();
		    if(t.save(a1))
		    System.out.println("Data entered sucessfully");
		     else
		   System.out.println("Check your Query");
		    
		   List<Agent> list2=t.displayAllAgent();
	        case 3:
	    	//System.out.println("Exit");
	    	System.exit(n);
		}
	}
		
		

		
 		
	}		
}
	


