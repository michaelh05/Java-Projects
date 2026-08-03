import java.util.ArrayList;

public class PayrollSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees = new ArrayList<>(); 
		
		//full time employee
		employees.add(new FullTimeEmployee("Michael", 100, "IT", 32000)); 
		employees.add(new FullTimeEmployee("Taylor", 101, "HR", 32000)); 
		//contractors
		employees.add(new Contractor("Charlie", 201, "Finance", 40.0, 80)); 
		employees.add(new Contractor("Diana", 202, "Marketing", 35.0, 60)); 
		
		//Magic Loop 
		for (Employee worker : employees) {
			System.out.println(worker.toString()); 
			System.out.println("Pay: $" + worker.calculatePay());
			
			if (worker instanceof Contractor){
				Contractor c = (Contractor) worker; 
				c.printContractorDetails(); 
			}
			
			System.out.println("----------------"); //spacer for readability
		}
		
		
	}	

}
