import java.util.Scanner;

public class Spaceship {
	
		private String name;
		private int fuelLevel;
		private boolean inSpace;
		
		public Spaceship(String name) {
			this.name = name; 
			this.fuelLevel = 100; 
			this.inSpace = false; 
		}

	    // 3. Logic Methods (YOU WRITE THESE)
	    // Write a method 'launch()'. Copy the "Launch Logic" from Part A into here.
	    // NOTE: Use 'this.fuelLevel' instead of the loose variables

		public void launch() {
	        if (fuelLevel >= 20) {
	            fuelLevel -= 20;
	            inSpace = true;
	            System.out.println("Blast off! We are in space.");
	        } else {
	            System.out.println("Launch failed: Not enough fuel.");
	        }
		}

	    // Write a method 'refuel()'. Copy the "Refuel Logic" from Part A into here.
	    public void refuel() {
	        fuelLevel = 100;
	        System.out.println("Refueled. Current Fuel: " + fuelLevel);
	    }
	    // Write a toString() method to print the ship's status.
	    
	    public String toString() {
	    	return "\nShip Name: " + this.name +
	    			"\nFuel Level: " + this.fuelLevel + 
	    			"\nIn Space: " + this.inSpace; 
	    }
		
}
