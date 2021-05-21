package hust.soict.hedspi.aims.Aims;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order.Order;

public class DiscTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Order anOrder = new Order("Hieu order");
		   //  Order order2 = new Order("hieu order");
		     
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
			 
			 
			DigitalVideoDisc[]dvdList = new DigitalVideoDisc[4];
			 dvdList[0] = dvd1;
			 dvdList[1]= dvd2;
			 dvdList[2]= dvd3;
			 dvdList[3]= dvd4;
			// anOrder.addDigitalVideoDisc(dvdList[0]);
			 //anOrder.addDigitalVideoDisc(dvdList[3]);
			 //anOrder.getALuckyItem(dvdList);
	}

}
