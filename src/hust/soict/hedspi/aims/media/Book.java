package hust.soict.hedspi.aims.media;

import java.util.*;

public class Book extends Media{
 
  private List<String> authors = new ArrayList<String>();
	
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
  
   public Book() {
   }
  public void  addAuthor(String authorName) {
	  if(authors.contains(authorName)) {
		  System.out.println("This authorname has been available");
	  }
	  else {
		  authors.add(authorName);
	  }
  }
  public void removeAuthor(String authorName) {
	  if(authors.contains(authorName)) {
		  authors.remove(authorName);
	  }
	  else {
		  System.out.println("This authour name is unavailable");
	  }
  }
public Book(String title, String category, float cost, List<String> authors) {
	super(title,category,cost);
	
	this.authors = authors;
}
	public Book(String title){
	        super(title);
	}
	public Book(String title,String category){
	        super(title,category);
    }
	Book(String title,String category,List<String> authors){
			super(title, category);
			this.authors = authors;
			//TODO: check author condition
			}
	
	
	
}
