
public class PhysicalProduct extends Product{
	
	private double shippingWeight; 
	
	//constructor 
	public PhysicalProduct(int productId, double basePrice, double shippingWeight) {
		super(productId, basePrice); 
		this.shippingWeight = shippingWeight; 
	}
	
	
	//override methods
	@Override 
	public double calculateTotalCost() {
		return (getBasePrice() * 1.08) + (shippingWeight * 2.50); 
	}
	
	@Override
	public void fulfillOrder() {
		System.out.println("Printing shipping label for physical item."); 
	}
}
