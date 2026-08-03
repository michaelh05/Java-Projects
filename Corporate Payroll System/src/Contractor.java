
public class Contractor extends Employee{

	private double hourlyRate; 
	private int hoursWorked; 
	
	// constructor
	public Contractor(String name, int id, String department, double hourlyRate, int hoursWorked) {
		super(name, id, department); 
		this.hourlyRate = hourlyRate; 
		this.hoursWorked = hoursWorked; 
	}
	
	// METHODS
	@Override	
	public double calculatePay() {
		return hourlyRate * hoursWorked; 
	}
	
	// UNIQUE METHODS
	public void printContractorDetails() {
		System.out.println("Department: " + department); 
	}
}
