
public class MissionControl {
	
	public static void main(String[] args) {
		
		Spaceship s1 = new Spaceship("Artemis"); 
	
		s1.launch(); 
		System.out.println(s1); 
		s1.launch(); 
		System.out.println(s1); 
		s1.refuel(); 
		System.out.println(s1);
	
	}
	
}
