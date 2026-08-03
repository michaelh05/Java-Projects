
public class PaymentProcessor {

	public static void charge(Product p) throws GatewayTimeoutException {
		
		// loud network failure sim
		if (p.getBasePrice() == 999.99) { 
		    throw new GatewayTimeoutException("External payment gateway timed out.");
		}

		// console output proof of success
		System.out.println("Payment processed successfully.");
	}
}