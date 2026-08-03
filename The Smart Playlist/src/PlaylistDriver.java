import java.util.ArrayList;

public class PlaylistDriver {

	public static void main(String[] args) {
		
		//list creation 
		ArrayList<Song> myPlaylist = new ArrayList<>();
		
		//AI Generated Song list
		Song song1 = new Song("Blinding Lights", "The Weeknd", 3.2);
        Song song2 = new Song("Bohemian Rhapsody", "Queen", 5.9); // > 5.0 mins
        Song song3 = new Song("Shape of You", "Ed Sheeran", 4.1);
        Song song4 = new Song("Hotel California", "Eagles", 6.3); // > 5.0 mins
        
        myPlaylist.add(song1);
        myPlaylist.add(song2);
        myPlaylist.add(song3);
        myPlaylist.add(song4);
        
        
        //creating a duplicate song 
        Song duplicateSong = new Song("Blinding Lights", "The Weeknd", 3.2);

        
        //checking duplicate against original songs in the object 
        if (myPlaylist.contains(duplicateSong)) {
            System.out.println("Duplicate found, not adding.");
        } else {
            myPlaylist.add(duplicateSong);
        }
        
        
        //safe deletion iterating backward 
        for (int i = myPlaylist.size() - 1; i >= 0; i--) {
            if (myPlaylist.get(i).getDuration() > 5.0) {
                System.out.println("Removing: " + myPlaylist.get(i));
                myPlaylist.remove(i);
            }
        }
        
        //final playlist output 
        System.out.println("\nFinal Playlist:");
        for (Song song : myPlaylist) {
            System.out.println(song);
        }
	}

}
