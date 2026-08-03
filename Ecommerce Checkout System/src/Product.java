
public abstract class Product implements Payable, Comparable<Product> {
	
	public static final String STORE_NAME = "te-clothing"; 
	
	//private variables
	private int productId; 
	private double basePrice; 
	private static int totalProducts = 0; 
	private static double totalCatalogValue = 0.0; 
	private static double averagePrice = 0.0; 
	

	
	//constructor 
	protected Product(int productId, double basePrice) {
		this.productId = productId; 
		this.basePrice = basePrice; 
		
		totalProducts++; 
		totalCatalogValue += basePrice; 
	}
	
	
	//getters
	public double getBasePrice() {
		return basePrice; 
	}
	
	public int getProductId() {
		return productId; 
	}
	
	public static int getTotalProducts() {
		return totalProducts; 
	}
	
	public static double getTotalCatalogValue() {
		return totalCatalogValue; 
	}
	
	public static double getAveragePrice() {
		averagePrice = totalCatalogValue / totalProducts; 
		return averagePrice; 
	}
	
	//abstract methods for child 
	public abstract void fulfillOrder(); 
	
	//compare overrride
	@Override 
	public int compareTo(Product other) {
		// comparing prices to sort
        int priceComparison = Double.compare(this.basePrice, other.basePrice);
        
        if (priceComparison != 0) {
            return priceComparison;
        }
        
        // id used if tied
        return Integer.compare(this.productId, other.productId);
	}
}
