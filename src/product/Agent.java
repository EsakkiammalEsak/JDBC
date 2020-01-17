package product;

public class Agent extends Admin {
private String ProductID;
private String BuyorSell;
private int Quantity;



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

float TotalCost;
public void BuyorSell(String ProductId,String ProductName,float Price,int QuantityAvailable,int Quantity,String ProductID)
{
	if(ProductID==ProductId)
	{
		System.out.println("Product name"+ProductName);
		System.out.println("Price"+Price);
	}
	if(Quantity<=QuantityAvailable)
	{
		System.out.println("Product is available");
		TotalCost=Quantity*Price;
		System.out.println("TotalCost"+TotalCost);
	}
	else
	{
		System.out.println("Product is unavailable");
	}
	
}

}