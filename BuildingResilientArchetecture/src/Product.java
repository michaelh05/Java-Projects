
import java.util.Objects; 

public abstract class Product {
	
	public static final String STORE_NAME = "te-clothing"; 
	
	//private variables
	private int productId; 
	private double basePrice; 
	private String name;  
	

	
	//constructor 
	protected Product(int productId, String name, double basePrice) {
        
		//null check on name 
        this.name = Objects.requireNonNull(name, "Name cannot be null");

        // Validate basePrice and ProductId
        if (productId <= 0) {
            throw new InvalidProductStateException("ID must be greater than 0", productId);
        }
        
        if (basePrice < 0) {
            throw new InvalidProductStateException("Price cannot be negative", basePrice);
        }

        this.productId = productId;
        this.basePrice = basePrice;
    }
	
	
	//getters
	public double getBasePrice() {
		return basePrice; 
	}
	
	public int getProductId() {
		return productId; 
	}
	
	public String getName() {
		return name; 
	}
	
	//overrrides
	@Override
	public boolean equals(Object obj) {
	    // quick return check
	    if (this == obj) {
	        return true;
	    }

	    // check if null or classes do not strictly match 
	    if (obj == null || getClass() != obj.getClass()) {
	        return false;
	    }

	    // downcast 
	    Product other = (Product) obj;

	    // compare entity identity (product id) 
	    return this.productId == other.productId;
	}
	
	//override hashCode 
	@Override
    public int hashCode() {
		//objects is imported java.util
        return Objects.hash(productId);
    }
	
}
