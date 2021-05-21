package hust.soict.hedspi.aims.media;

public class Disc {
 private int length;
 private String director;
public int getLength() {
	return length;
}

public String getDirector() {
	return director;
}

public Disc(int length, String director) {
	super();
	this.length = length;
	this.director = director;
}

public Disc(int length) {
	super();
	this.length = length;
}

public Disc(String director) {
	super();
	this.director = director;
}


 
}
