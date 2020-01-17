package product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Agent extends Admin {
private String ProductID;
private String BuyorSell;
private int Quantity;
private String name;
private float TotCost;
public float getTotCost() {
	return TotCost;
}

public void setTotCost(float totCost) {
	TotCost = totCost;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public int getQuantityAvail() {
	return QuantityAvail;
}

public void setQuantityAvail(int quantityAvail) {
	QuantityAvail = quantityAvail;
}


private float price;
private int QuantityAvail;



public Agent() {
	super();
	// TODO Auto-generated constructor stub
}

public String getProductID() {
	return ProductID;
}

public void setProductID(String productID) {
	ProductID = productID;
}

public String getBuyorSell() {
	return BuyorSell;
}

public void setBuyorSell(String buyorSell) {
	BuyorSell = buyorSell;
}

public int getQuantity() {
	return Quantity;
}

public void setQuantity(int quantity) {
	Quantity = quantity;
}
}
/*float TC=0;
public float Display() throws SQLException

{
	Connection connection;
	connection=ConnectionManager.getConnection();
	Statement ss=connection.createStatement();
	ResultSet rs= ss.executeQuery("Select * from Admin where ProductId ="+ProductID);
	while(rs.next())
	{
	String name =rs.getString("ProductName")	;
	float price=rs.getFloat("Price");
	int Quan=rs.getInt("QuantityAvailable");
	System.out.println("Quan");
	if(Quantity<=Quan)
	{
		System.out.println("Product is available");
		TC=Quantity*price;
		System.out.println("TotalCost"+TC);
	}
	else
	{
		System.out.println("Product is unavailable");
	}
	
	}
	return  TC;
	
	
								
	
}

}*/