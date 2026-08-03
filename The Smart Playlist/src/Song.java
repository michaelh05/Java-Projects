
public class Song {
	
	private String title; 
	private String artist; 
	private double durationMinutes; 
	
	//constructor 
	public Song(String title, String artist, double duration) {
		this.title = title; 
		this.artist = artist; 
		this.durationMinutes = duration; 
	}
	
	
	//Getter functions for title artist and duration 
	public String getTitle() {
		return title; 
	}
	
	public String getArtist() {
		return artist; 
	}
	
	public double getDuration() {
		return durationMinutes;
	}
	
	
	//to string with override to reduce java confusion 
	@Override 
	public String toString() {
		return title + " by " + artist + " (" + durationMinutes + " mins)";
	}
	
	//obj comparison function to reduce duplicates
	@Override
    public boolean equals(Object obj) {
        if (obj instanceof Song) {
            Song other = (Song) obj;
            return this.title.equalsIgnoreCase(other.title)
                    && this.artist.equalsIgnoreCase(other.artist);
        }
        return false;
    }
}
