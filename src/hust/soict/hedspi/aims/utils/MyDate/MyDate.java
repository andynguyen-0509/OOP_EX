package hust.soict.hedspi.aims.utils.MyDate;
import java.util.*;

public class MyDate {
    private static String dateOrdered;
	 private int day;
	 private int month;
	 private int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day<0 || day>31)
		{
			System.out.println("This day is invalid");
		}
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month<0 || month>12) {
			System.out.println("This month is invalid ");
		}
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year<0 ) {
			System.out.println("This year is invalid ");
		}
		this.year = year;
	}
	public MyDate() {
	}
	public MyDate(int day,int month, int year) {
		super();
		this.day =day;
		this.month= month;
		this.year = year;
	}
	public MyDate(String strDate)
	{
		// Xoa tat ca khoang trang truoc khi lam viec
		strDate = strDate.replaceAll("\\s", "");
		
		String[] strMonth = new String[] { "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		String[] strMonthRutGon = new String[12];
		String[] strMonthThemCham = new String[12];
		
		for (int i = 0; i < 12; i++) {
			strMonthRutGon[i] = strMonth[i].substring(0, 3);
			strMonthThemCham[i] = strMonthRutGon[i] + ".";
		}
		
		int i = 0;
		boolean isValidMonth = false;
		for (i = 0; i<12; i++)
		{
			if (strDate.indexOf(strMonth[i]) != -1 
					|| strDate.indexOf(strMonthRutGon[i]) != -1 
					|| strDate.indexOf(strMonthThemCham[i]) != -1)
			{
				isValidMonth = true;
				break;	
			}
		}
		
		if (!isValidMonth)
		{
			System.out.println("Invalid form of month");
			return;
		}
		
		this.month = i+1;
		
		if (strDate.indexOf(strMonth[i]) != -1)
			strDate = strDate.replaceFirst(strMonth[i], "");
		else if(strDate.indexOf(strMonthThemCham[i]) != -1)
			strDate = strDate.replaceFirst(strMonthThemCham[i], "");
		else strDate = strDate.replaceFirst(strMonthRutGon[i], "");

		// Xem xet den ngay va nam
		if (strDate.indexOf("th") != -1)
		{
			this.day = Integer.parseInt(strDate.split("th")[0]);
			this.year = Integer.parseInt(strDate.split("th")[1]);
		}
		else if (strDate.indexOf("rd") != -1)
		{
			this.day = 3;
			this.year = Integer.parseInt(strDate.split("rd")[1]);
		}
		else if (strDate.indexOf("nd") != -1)
		{
			this.day = 2;
			this.year = Integer.parseInt(strDate.split("nd")[1]);
		}
		else if (strDate.indexOf("st") != -1)
		{
			this.day = 1;
			this.year = Integer.parseInt(strDate.split("st")[1]);
		}
		else
		{
			System.out.println("Invalid form of date");
			return;
		}
		
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your date: ");
		String date = sc.nextLine();
		MyDate currentDay = new MyDate(date);
		setDay(currentDay.getDay());
		setMonth(currentDay.getMonth());
		setYear(currentDay.getYear());
		sc.close();
	}
	public void printDate() {
		//MyDate date = new MyDate();
		System.out.println(this.getDay()+"/"+this.getMonth()+"/"+this.getYear());
	}
}
