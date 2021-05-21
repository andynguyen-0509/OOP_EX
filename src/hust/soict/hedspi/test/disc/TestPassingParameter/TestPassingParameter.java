package hust.soict.hedspi.test.disc.TestPassingParameter;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 DigitalVideoDisc JungleDvd =new DigitalVideoDisc("Jungle","","",17,14.45f);
	 DigitalVideoDisc CinderellaDvd =new DigitalVideoDisc("Cinderella"," "," ",25,20.95f);
	 Swap (JungleDvd, CinderellaDvd);
	 System.out.println("Jungle dvd title: "+JungleDvd.getCost());
	 System.out.println("Cinderella dvd title: "+CinderellaDvd.getCost());
	 changeTitle(JungleDvd,"Hieu iu iu");
	 System.out.println(JungleDvd.getTitle());
	 }
 public static void swap(Object a1 , Object a2) {
	 Object tmp =a1;
	 a1 = a2;
	 a2= tmp;
 }
 public static void changeTitle (DigitalVideoDisc dvd, String title) {
	 String oldTitle = dvd.getTitle();
	 dvd.setTitle(title);
	 dvd = new DigitalVideoDisc(dvd.getTitle());
 	}
  public static void Swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
	  DigitalVideoDisc tmp = new DigitalVideoDisc();
	  tmp.setTitle(dvd1.getTitle());
	  tmp.setCategory(dvd1.getCategory());
	  tmp.setDirector(dvd1.getDirector());
	  tmp.setLength(dvd1.getLength());
	  tmp.setCost(dvd1.getCost());
	  
	  dvd1.setTitle(dvd2.getTitle());
	  dvd1.setCategory(dvd2.getCategory());
	  dvd1.setDirector(dvd2.getDirector());
	  dvd1.setLength(dvd2.getLength());
	  dvd1.setCost(dvd2.getCost());
	  
	  dvd2.setTitle(tmp.getTitle());
	  dvd2.setCategory(tmp.getCategory());
	  dvd2.setDirector(tmp.getDirector());
	  dvd2.setLength(tmp.getLength());
	  dvd2.setCost(tmp.getCost());
	  
  }
}
