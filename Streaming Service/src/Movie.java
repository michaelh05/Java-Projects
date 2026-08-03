
public class Movie {

	private String title; //private variables
	private int durationMinutes;
	private boolean is4K; 
	
	public Movie(String title, int durationMinutes, boolean is4K) { //movie object allowing for title time and is4K
		this.title = title; 
		this.durationMinutes = durationMinutes; 
		this.is4K = is4K; 
	}
	
	public String toString() {
        return title + " | " + durationMinutes + " min | 4K: " + is4K;
    }//toString allows for console display of movie object information 

    public void upgradeQuality() {//upgrade quality to 4K if not output Already high def
        if (!is4K) {
            is4K = true;
            System.out.println("Quality upgraded.");
        } else {
            System.out.println("Already high def.");
        }
    }
}
