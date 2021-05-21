package hust.soict.hedspi.test.utils.DateTest;

import hust.soict.hedspi.aims.utils.DateUtils.DateUtils;
import hust.soict.hedspi.aims.utils.MyDate.MyDate;

public class DataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate currentDate = new MyDate(2,5,2021);
		MyDate inputDate = new MyDate(13, 4, 2020);
		MyDate breakDate = new MyDate("April 14th 2018");
		
		//breakDate.setDay(100);
		inputDate.setMonth(5);
		System.out.println(breakDate.getMonth());
		
		
		//breakDate.accept();
		System.out.println(breakDate.getYear());
		//DateUtils check = new DateUtils(inputDate,breakDate);
		//inputDate.printDate();
		DateUtils date = new DateUtils();
		MyDate[]  AllDate = new MyDate[5];
	    AllDate[0] = new MyDate(2,11,2024);
	    AllDate[1] = new MyDate(2,1,2025);
	    AllDate[2] = new MyDate(26,10,2024);
	    AllDate[3] = new MyDate(14,10,2024);
	    AllDate[4] = new MyDate(22,10,2025);
	    date.addDate(AllDate);
		//date.addDate(inputDate);
	//	date.addDate(breakDate);
	//	date.addDate(currentDate);
	//date.swap(inputDate,breakDate);
		date.SortDate();
        date.printDateAfterSorted();
        
	}
       
       
}
