package lab1;
import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;
	private Scanner scan = new Scanner(System.in);
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date() {
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}

	public static void main(String[] args) {
		Date date1 = new Date(21, 9, 2023);
		date1.output();
		Date date2 = new Date();
		date2.input();
		date2.output();
		
		if(date1.before(date2)) {
			System.out.println(date1.toString() + " is before " + date2.toString());
		} else {
			System.out.println(date1.toString() + " is not before " + date2.toString());
		}
		
		
	}
	
	public boolean before(Date date2) {
		Date date1 = this;
		if(date1.year > date2.year) {
			return true;
		} else if (date2.year > date1.year) {
			return false;
		} else if (date1.year == date2.year) {
			if(date1.month > date2.month) {
				return true;
			} else if (date1.month == date2.month) {
				if(date1.day > date2.day) {
					return true;
				} else if(date1.day == date2.day) {
					return true;
				} else {
				}
					return false;
				}
			} else {
				return false;
			}
		return false;
	}
	
	public void input() {
		while(this.day > 31 || this.day < 1) {
			System.out.println("What is the Day?");
			this.day = scan.nextInt();
		}
		while(this.month > 12 || this.month < 1) {
			System.out.println("What is the Month?");
			this.month = scan.nextInt();
		}
		System.out.println("What is the Year?");
		this.year = scan.nextInt();
	}
	
	public void output() {
		System.out.println(this.month + "/" + this.day + "/" + this.year);
	}
	
	public String toString() {
		return this.month + "/" + this.day + "/" + this.year;
	}

}
