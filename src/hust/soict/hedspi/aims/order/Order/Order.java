package hust.soict.hedspi.aims.order.Order;
import java.util.ArrayList;
import java.util.Date;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
public class Order {
private String orderName;
private static int MAX_NUMBERS_ORDERED = 10;
public static int MAX_LIMITED_ORDER =1;


private static int nbOrders=0;
private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
public Order() {
	nbOrders++;
	System.out.println("You've added an order");
	if(nbOrders ==MAX_LIMITED_ORDER) {
		System.out.println("You've ordered too much");
	}
}
public Order(String name) {
	orderName = name;
	
	
	if(nbOrders ==MAX_LIMITED_ORDER) {
		System.out.println("You've ordered too much");
		System.out.println("You can't order "+name);
	}
	else if(nbOrders <MAX_LIMITED_ORDER) {
	System.out.println("Order "+ name +" have been added");}
	nbOrders++;
}
public void addMedia(Media md) {
	itemsOrdered.add(md);
}
public void removeMedia(Media md) {
    if (!itemsOrdered.isEmpty()) {
    	itemsOrdered.remove(md);
}
    else {
    	System.out.println("The item in order is empty");
    }
  }
public  float totalCost() {
	float cost=0.0f;
	for (int i=0;i< itemsOrdered.size();i++) {
		cost+= itemsOrdered.get(i).getCost();
	}
	return cost;
}
public void getALuckyItem(Media[] mdList) {

  int random = 1;
  while (itemsOrdered.contains(mdList[random])) {
	  random = (int)(Math.random() * mdList.length );
  }
  mdList[random].setCost(0); 
  this.print();
  System.out.println("You've been lucky to get 1 free item: "+mdList[random].getTitle());

    
} 


public void print() {
	
	System.out.println("*********************Order: "+ this.orderName+"********************");
	Date date = new Date();
	System.out.print("Date: ");
	System.out.println(date.toString());
	
	for (int i=0;i<itemsOrdered.size();i++) {
		System.out.println((i+1)+"-DVD-"+itemsOrdered.get(i).getCategory()+"-"+itemsOrdered.get(i).getTitle());
	}
	System.out.println("Total cost: "+this.totalCost());
	System.out.println ("***************************************************");
}
}
