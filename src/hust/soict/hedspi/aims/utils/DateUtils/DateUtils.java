package hust.soict.hedspi.aims.utils.DateUtils;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate.MyDate;

public class DateUtils {
  private  MyDate date1;
  private MyDate date2;
  private int MaxDate = 10;
  private int dateNum =0;
  private MyDate[] AllDate = new MyDate[MaxDate];
  public DateUtils(MyDate date1,MyDate date2) {
	  this.date1 = date1;
	  this.date2 = date2;
  }
  public DateUtils() {}
  
  public void check(MyDate date1, MyDate date2){
	  if(date1.equals(date2)) {
	  System.out.print(true);
  }
  else {
	  System.out.print(false);
	  }
  }
  public void addDate (MyDate date ) {
		if( dateNum< MaxDate) {
		AllDate[dateNum] = date;
			dateNum ++;
		}
		
			if (dateNum== MaxDate) {
				System.out.println("The all date is almost full");
		}
	}
	public void  addDate(MyDate[] AllDate) {
		int n = AllDate.length;
		for (int i=0;i<n ;i++) {
			addDate(AllDate[i]);
		}
	}
 public void swap(MyDate date1, MyDate date2) {
	 MyDate tmp= new MyDate();
	 tmp.setDay(date1.getDay());
	 tmp.setMonth(date1.getMonth());
	 tmp.setYear(date1.getYear());
	 
	 date1.setDay(date2.getDay());
	 date1.setMonth(date2.getMonth());
	 date1.setYear(date2.getYear());
	 
	 date2.setDay(tmp.getDay());
	 date2.setMonth(tmp.getMonth());
	 date2.setYear(tmp.getYear());
	 
 }
 
  public void SortDate() {
	  for(int i=0;i<dateNum-1;i++) {
		for(int j=i+1;j<dateNum;j++) {
			if(AllDate[i].getYear()>AllDate[j].getYear()) {
				swap(AllDate[i],AllDate[j]);
			}
			if((AllDate[i].getYear()==AllDate[j].getYear())&&(AllDate[i].getMonth()>AllDate[j].getMonth())) {
				swap(AllDate[i],AllDate[j]);
			}
			if((AllDate[i].getYear()==AllDate[j].getYear())&&(AllDate[i].getMonth()==AllDate[j].getMonth())&&AllDate[i].getDay()>AllDate[j].getDay()) {
				swap(AllDate[i],AllDate[j]);
			}
		}
	  }
  }
  public void printDateAfterSorted() {
	  for(int i=0;i<dateNum;i++) {
		  AllDate[i].printDate();
	  }
	  System.out.print(dateNum);
  }
  
  
}
