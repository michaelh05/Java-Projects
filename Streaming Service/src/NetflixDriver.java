
public class NetflixDriver {
	
	public static void main(String[] args) {
		
		Movie m1 = new Movie("Inception", 148, false);
		Movie m2 = new Movie("Shrek", 89, false); 
		
		System.out.println(m1); 
		System.out.println(m2); 
		
		m1.upgradeQuality();
		System.out.println(m1); 
		
		m1.upgradeQuality();
		System.out.println(m1); 
		
		
		System.out.println(m1); 
		System.out.println(m2); 
	}
}
