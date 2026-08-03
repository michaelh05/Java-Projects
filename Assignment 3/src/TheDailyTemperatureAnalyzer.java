import java.util.Scanner;

public class TheDailyTemperatureAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); 
		
		double[] days = new double[7]; 
		
		//get user input for temps for each day
		for (int i=0; i<7; i++) {
			System.out.printf("Enter temp for Day %d: ", i +1);
			days[i] = input.nextInt(); 
		}
		
		//running methods
		double avg = Average(days); 
		double max = MaxTemp(days); 
		
		//calculated output to user
        System.out.println("\n--- Weekly Report ---");
        System.out.printf("Average Temp: %.1f%n", avg);
        System.out.printf("Highest Temp: %.1f%n", max);

        //weather warning check
        if (avg > 90) {
            System.out.println("Alert: Heat Wave Warning!");
        } else if (avg < 32) {
            System.out.println("Alert: Freeze Warning!");
        } else {
            System.out.println("Status: Normal Weather.");
        }

		
		input.close(); 
	}
	
	
	//Method to find average
	public static double Average(double days[]) {

		double total = 0.0;

		for (double temp : days) {
		    total += temp;
		}

		double average = total / days.length;
		
		return average; 
	}
	
	//Method to find Max Temp
	public static double MaxTemp(double days[]) {

		double max = 0.0; 
		
		for (int i = 1; i < days.length; i++) {
		    if (days[i] > max) {
		    	max = days[i]; 
		    }
		}

		return max; 
	}

}
