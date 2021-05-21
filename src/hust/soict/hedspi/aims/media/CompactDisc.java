package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
 private String artist;
 private ArrayList<Track> tracks = new ArrayList<Track>();
	public CompactDisc(int length, String director, String artist) {
		super(length, director);
		this.artist = artist;
	}
	public CompactDisc(int length, String director, String artist, ArrayList<Track> tracks) {
		super(length, director);
		this.artist = artist;
		this.tracks = tracks;
	}
	public String getArtist() {
		return artist;
	}
	public void addTrack(Track track) {
		if(tracks.contains(track)) {
		System.out.println("This track is available");
	}
	else {
		tracks.add(track);
	}
	}
	public void removeTrack(Track track ) {
		  if(tracks.contains(track)) {
			  tracks.remove(track);
		  }
		  else {
			  System.out.println("This track is unavailable");
		  }  
}
	public int  getLength() {
		int len=0;
		for(int i=0 ;i<tracks.size();i++) {
			len+= tracks.get(i).getLength();
		}
		return len;
	}
	public void play() {
		for (int i=0;i<tracks.size();i++) {
		System.out.println("Playing DVD: " + tracks.get(i).getTitle());
		System.out.println("DVD length: " + tracks.get(i).getLength());
		}
	}
}
