
public class FullTimeEmployee extends Employee{
	
	private double annualSalary; 
	
	//Constructor
	public FullTimeEmployee(String name, int id, String department, double annualSalary) {
		super(name, id, department); 
		this.annualSalary = annualSalary; 
	}
	
	
	//METHODS
	@Override
	public double calculatePay() { 
		return annualSalary / 26; 
	}
	
	
	
	
}
