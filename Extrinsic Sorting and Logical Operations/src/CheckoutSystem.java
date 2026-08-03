import java.util.*; //grabs full utility

public class CheckoutSystem {

	public static void main(String[] args) {
		
		//header
		System.out.println("=== Testing Logical Equality ===");
		
		//hash test
		HashSet<Product> inventory = new HashSet<>();
		
		Product p1 = new DigitalProduct( 101, 19.99,"Java eBook"); 
		inventory.add(p1); 
		
		// product with same id as p1
		Product p2 = new DigitalProduct(101, 9.99, "Outdated eBook"); //not added to hashset individually
		
		//hash check should return true 
		 System.out.println("HashSet contains p2: " + inventory.contains(p2));
		 
		 //	setting up catelog 
		 ArrayList<Product> catalog = new ArrayList<>();
		 
		 // products for catalog
		 catalog.add(new DigitalProduct(303, 5.00, "zebra sticker")); 
		 catalog.add(new DigitalProduct(101, 150.00, "Apple Keyboard")); 
		 catalog.add(new DigitalProduct( 202, 99.00, "java textbook")); 
		 
		 // sorting 1 class strategy
		 Collections.sort(catalog, new PriceComparator());
		 
		 System.out.println("\nSorted by Price (Descending):");
	        for (Product p : catalog) {
	            System.out.println(p.getName() + " - $" + p.getBasePrice());
	        }
	    
	    // Lamda Sorting strategy
	  
		/*Lamda Expression: */
	    catalog.sort((a, b) ->
	    String.CASE_INSENSITIVE_ORDER.compare(a.getName(), b.getName())); 
	    
	    System.out.println("\nSorted by Name (A-Z, Case-Insensitive):");
	    for (Product p : catalog) {
	    	System.out.println(p.getName() + " - $" + p.getBasePrice());
}
		
		
	}

}
