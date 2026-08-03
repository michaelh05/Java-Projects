
public class Employee {
	
	private String name; 
	private int id; 
	protected String department; 
	
	// constructor
	public Employee(String name, int id, String department) {
		this.name = name; 
		this.id = id; 
		this.department = department; 
	}
	
	// GETTERS
	public String getName() {
		return name; 
	}
	
	public int getId() {
		return id; 
	}
	
	
	// MEHTODS
	public double calculatePay() {
		return 0.0; 
	}
	
	@Override 
	public String toString() {
	//"[Name] - ID: [ID]".
		return "[" + name + "] - " + "ID: " + "[" + id + "]";  
	}
	
	
}
