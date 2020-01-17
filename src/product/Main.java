package product;
import java.util.List;
import java.util.Scanner;

import daompl.Agentimp;
import daompl.Register;
import daompl.productimp;


public class Main {

	public static void main(String[] args) {
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
		float TotalCost;
		ProductId=s.next();
		 ProductName=s.next();
	     MinSellQuantity=s.nextInt();
	     Price=s.nextFloat();
	      TotalCost=MinSellQuantity*Price;
	      QuantityAvailable=MinSellQuantity;
	      ProductID=s.next();
	    	BuyorSell=s.next();
	    	Quantity=s.nextInt();
		//ConnectionManager cm=new ConnectionManager();
		//cm.getConnection();
		while(true) {
	    System.out.println("1.Admin\t 2.Agent\t 3.Exit");
		int n=s.nextInt();
	    switch(n)
		{
		case 1:
			while(true)
			
			{
				
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
	    	/*ProductID=s.next();
	    	BuyorSell=s.next();
	    	Quantity=s.nextInt();*/
	    	a1.setProductName(ProductName);
	    	a1.setPrice(Price);
	    	a1.setQuantityAvailable(QuantityAvailable);
	    	a1.setProductID(ProductID);
	    	a1.setBuyorSell(BuyorSell);
            a1.setQuantity(Quantity);
            a1.setTotalCost(TotalCost);
	    	a1.BuyorSell(ProductId,ProductName,Price,QuantityAvailable,Quantity,ProductID);
	    	Agentimp t   =new AgentDao();
		    if(t.save(a1))
		    System.out.println("Data entered sucessfully");
		     else
		   System.out.println("Check your Query");
		    
		   List<Agent> list2=t.displayAllAgent();
	        case 3:
	    	System.out.println("Exit");
	    	System.exit(n);
		}
	}
		
		

		
 		
	}		
}
	


