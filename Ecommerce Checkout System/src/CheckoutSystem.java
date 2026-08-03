/* REFLECTION ANSWERS:
 * 1. Why is Payable an interface instead of an abstract class?
 * (Hint: What does ConsultingService need? Does it need state?)
 * Since it does not have instance variables and is strictly defining behavior. We are able to use it across different types of payables due to it being an instance and not a class. This would not be possible if it had any instance information however. 
 * 2. Why does ConsultingService implement Payable instead of extending Product?
 * (Hint: What is the relationship? Is a service a type of product?)
 * Since consulting is a service and not a product. There would be no itemId, basePrice, or weight for a service. There is a price, but the other information in the product category did not apply. This is why we created payable as an interface to begin with. 
 * 3. Why can a ConsultingService object be added to an ArrayList<Payable> 
 * but NOT to an ArrayList<Product>?
 * (Hint: What does the generic reference type require?)
 * This is simply because ConsultingService is not a product. It was never told to inherit any product information therefore it cannot be added to an arraylist of Product object types. Since it is a payable though, it can be added to a Payable array list because it is an object of type payable.
 */




import java.util.ArrayList;
import java.util.Collections; 

public class CheckoutSystem {

	public static void main(String[] args) {
		
		//A9a implentation - welcome and inital information
		System.out.println("=== Welcome to " + Product.STORE_NAME + " ===");
		System.out.printf("[Pre-Load] Total Products: %d | Catalog Value: $%.2f | Average: $%.2f\n\n",
		        Product.getTotalProducts(),
		        Product.getTotalCatalogValue(),
		        Product.getAveragePrice());
        
        //empty cart arraylist 
        ArrayList<Product> emptyCart = new ArrayList<>(); 
        Collections.sort(emptyCart);
        System.out.println("System Did Not Crash"); 
        
		// Cart Arraylist
		ArrayList<Product> cart = new ArrayList<>(); 
		
		//adding items to cart 
		cart.add(new DigitalProduct (808, 15.99));
        cart.add(new PhysicalProduct (101, 29.99, 2.0));
        cart.add(new DigitalProduct (202, 15.99));
        cart.add(new PhysicalProduct (505, 9.99, 5.0));
        
        //Products, value and average price after data entry
        System.out.println("Before Cart is sorted"); 
        System.out.println("Total products: " + Product.getTotalProducts());
        System.out.println("Total catalog value: " + Product.getTotalCatalogValue());
        System.out.println("Average price: " + Product.getAveragePrice());
        System.out.println("\n\n");
        
        //Pre-sort cart 
        System.out.println("=== Unsorted Cart ===");
        for (Product p : cart) {
            System.out.printf("Item: %-15s | ID: %d | Price: $%.2f%n",
                    p.getClass().getSimpleName(), //this line shows item type (ex. physical item/ digital item) 
                    p.getProductId(),
                    p.getBasePrice());
        }
        
        //sorting cart 
        Collections.sort(cart);
        System.out.println("After Cart is Sorted");
        System.out.println("Total products: " + Product.getTotalProducts());
        System.out.println("Total catalog value: " + Product.getTotalCatalogValue());
        System.out.println("Average price: " + Product.getAveragePrice());
        System.out.println("\n\n");
        //sorted cart items 
        System.out.println("=== Sorted Cart ===");
        for (Product p : cart) {
            System.out.printf("Item: %-15s | ID: %d | Price: $%.2f%n\n",
                    p.getClass().getSimpleName(), //this line shows item type (ex. physical item/ digital item) 
                    p.getProductId(),
                    p.getBasePrice());
        }
        
        //keep track of cart total
        double runningTotal = 0.0; 
        
        //EXAM TRAP Payable p = new DigitalProduct(301, 5.99);
        
     // Polymorphic loop
        for (Payable item : cart) {
            double cost = item.calculateTotalCost();	
            System.out.printf("Item total: $%.2f%n", cost);
            runningTotal += cost;
        }
        
        //TEST TRAP Payable p = new DigitalProduct(301, 5.99);
        System.out.printf("Grand total: $%.2f%n", runningTotal); 
        
        
	}

}
