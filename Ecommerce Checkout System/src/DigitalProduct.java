
public class DigitalProduct extends Product {

	//constructor
	public DigitalProduct(int productId, double basePrice) {
		super(productId, basePrice); 
	}
	
	//override methods
	@Override 
	public double calculateTotalCost() {
		return (getBasePrice() * 1.08); 
	}
	
	@Override
	public void fulfillOrder() {
		System.out.println("Generating secure download link."); 
	}
}
