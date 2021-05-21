package hust.soict.hedspi.aims.Aims;

import java.util.Scanner;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.order.Order.Order;

public class Aims {
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King");
		 dvd1.setCategory("Animation");
		 dvd1.setLength(87);
		 dvd1.setCost(19.95f);
		 dvd1.setDirector("Roller Allers");

		 
		 DigitalVideoDisc dvd2= new DigitalVideoDisc("The Star War");
		 dvd2.setCost(24.95f);
		 dvd2.setCategory("Animation");
		 dvd2.setDirector("Georgle Lucas");
		 
		 DigitalVideoDisc dvd3= new DigitalVideoDisc("Fly");
		 dvd3.setCost(23.05f);
		 dvd3.setCategory("Animation");
		 dvd3.setDirector("Georgle Regard");
		 
		 DigitalVideoDisc dvd4= new DigitalVideoDisc("Alice in Wonderland");
		 dvd4.setCost(25.05f);
		 dvd4.setCategory("Animation");
		 dvd4.setDirector("Anwar Regard");
		 
		 Book book1 = new Book("The happy","Comic");
		 ( book1).setCost(19.05f);
		 //book1.setAuthors("Author Hard");
		 Media[] media = new Media[5];
		 media[0]=dvd1;
		 media[1]=dvd2;
		 media[2]= dvd3;
		 media[3]= dvd4;
		 media[4]=book1;
	showMenu();
	
	Scanner sc = new Scanner(System.in);
	int choice = sc.nextInt();
	switch(choice){
	case(1):{
		Order anOrder = new Order();
		
	
	}
	case(2):{
		Order anOrder = new Order();
		anOrder.addMedia(dvd4);
	}
	case(3):{
		Order anOrder = new Order("Hieu's order");
		anOrder.addMedia(dvd4);
		anOrder.addMedia(book1);
		anOrder.getALuckyItem(media);
		
	}
	}
	sc.close();
	 		}
	
	}


