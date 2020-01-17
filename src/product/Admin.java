package product;

public class Admin {
	 String ProductId;
	 String ProductName;
	 int MinSellQuantity;
	 float price;
	int QuantityAvailable;
	float TotalCost;
	public Admin() {
	}
	
	
	public String getProductId() {
		return ProductId;
	}
	public void setProductId(String productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getMinSellQuantity() {
		return MinSellQuantity;
	}
	public void setMinSellQuantity(int minSellQuantity) {
		MinSellQuantity = minSellQuantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantityAvailable() {
		return QuantityAvailable;
	}
	public void setQuantityAvailable(int quantityAvailable) {
		QuantityAvailable = quantityAvailable;
	}
	public float getTotalCost() {
		return TotalCost;
	}
	public void setTotalCost(float totalCost) {
		TotalCost = totalCost;
	}
	public void AddProduct(String ProductId,String ProductName,int MinSellQuantity,float Price)
	{
		System.out.println("ProductName\t"+ProductName);
		System.out.println("ProductId\t"+ProductId);
		System.out.println("Minimum sell Quantity\t"+MinSellQuantity);
		System.out.println("Price\t"+Price);
		
		
	}
	public void Display(String ProductId,String ProductName,float Price,int QuantityAvailable,float TotalCost)
	{
		System.out.println("ProductName\t"+ProductName);
		System.out.println("ProductId\t"+ProductId);
		System.out.println("Price\t"+Price);
		System.out.println("Quantity Available\t"+QuantityAvailable);
		System.out.println("TotalCost\t"+TotalCost);
		
	}
	
	
}
