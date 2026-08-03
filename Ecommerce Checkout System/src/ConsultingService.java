
public class ConsultingService implements Payable {

	private double hourlyRate;
	private int hoursWorked; 
	
	//constructor
	public ConsultingService(double hourlyRate, int hoursWorked) {
		this.hourlyRate = hourlyRate; 
		this.hoursWorked = hoursWorked; 
	}
	
	//overrides
	@Override
	public double calculateTotalCost() {
		return hourlyRate * hoursWorked; 
	}
}


