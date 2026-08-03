import java.util.Scanner;

public class TechTool {

	public static void main(String[] args) {
		//System.out.println("Project Launched"); //testing project start remove when working
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter name: ");
		String name = input.next();
		
		input.nextLine(); //buffer flush
		
		System.out.print("Enter hours worked: ");
		double hoursWorked = input.nextDouble();

		System.out.print("Enter hourly rate: ");
		double hourlyRate = input.nextDouble();

		//input.close(); //input not available after this point

		double grossPay = hoursWorked * hourlyRate;
		double netPay = 0.0; 
		
		if (grossPay < 1000.0) {
			double tax = 0.1;
			netPay = grossPay - (grossPay * tax);
			System.out.printf("Net pay : %.2f", netPay);
		}	
		
		
		//Hardware Validator Start -- Part B
		
		System.out.println("\n--Validator--"); 

		//Scanner vInput = new Scanner(System.in); 
		
		input.nextLine(); //clear buffer
		
		System.out.print("Enter Installed Ram Amount: "); 
		int ram = input.nextInt(); 
		
		System.out.print("Enter CPU Cores: ");
		int cores = input.nextInt(); 
		
		//input.close(); //end scanner
		
		String tier = ""; 
		String recommendation = ""; 
		
		if (ram < 8 || cores < 4) {
			tier = "Tier 1 (Legacy)"; 
			recommendation = "Low-end Web Server"; 
		} else if (8 <= ram && ram <= 32 && 4 < cores && cores< 16) {
			tier = "Tier 2 (Standard)"; 
			recommendation = "Middle-end Storage Server"; 
		} else if (ram > 32 || cores > 16){
			tier =  "Tier 3 Enterprise"; 
			recommendation = "High-Performance Database"; 
		}
		
		System.out.printf("Server Tier: %s%nRecommendation: %s", tier, recommendation); //tier adn recommendation output
		
		
		//Comparison Tool -- Part C 
		System.out.println("\n--Comparison--"); 

		//Scanner cInput = new Scanner(System.in); 
		
		System.out.print("Enter budget Limit: ");
		double budgetLimit = input.nextDouble();
		
		if (netPay < budgetLimit) {
			System.out.println("Over Budget"); 
		} else if (netPay > budgetLimit) {
			System.out.println("Within Budget"); 
		}
		
		//Resource & Buffer management -- part D
		input.close(); 
		System.out.printf("System resources released. Session terminated."); 
	}
}
