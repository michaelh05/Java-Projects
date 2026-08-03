import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Reflection Questions:

1. This is do to the nature of unchecked exceptions. This should be done in the code not during runtime. We want to error fast to prevent the creation or upload of inaccurate data. Which in this case would be the negative value. 
2. A network error is not something that can be known or not known in the code. We bypass this unknown with try-catch blocks, and the throws notify of if things went through or not. This is why we use loud throws, so that there is no confusion about what is going on. 
3. Try-with-resources introduces and auto-close feature. This ensures a close() is ran and the program does not remain open. This could lead to data leaks, invalidation of data, memory issues, among many other security issues.
*/

public class CheckoutUI {

	public static void main(String[] args) {

		// exception for payment
		try {
			Product p = new DigitalProduct(1, "E-Book", 999.99);
			PaymentProcessor.charge(p);

		} catch (GatewayTimeoutException e) {
			System.out.println("Payment failed");

		} catch (Exception e) {
			System.out.println("Unexpected error: " + e.getMessage());
		}

		// load offline catalog
		loadOfflineCatalog("backup.txt");


		// remove to test crash - loud crash
		//Product badProduct = new DigitalProduct(2, "Broken Product", -10.0);
		
	}

	// Try-with-resources Syntax
	public static void loadOfflineCatalog(String filename) {

		try (Scanner scanner = new Scanner(new File(filename))) {

			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}

		} catch (FileNotFoundException e) {
			System.out.println("Warning: Offline catalog missing. Proceeding with empty cart." );
		}
	}
}