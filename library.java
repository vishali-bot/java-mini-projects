/*Enter Book ID: 101
Enter Book Name: Java Basics
Enter Author Name: Gosling
Enter Student Name: Vishali
Enter Issued Day Number: 1
Enter Return Day Number: 20
---- Library Information ----
Book ID: 101
Book Name: Java Basics
Author: Gosling
Student Name: Vishali
Book Taken For: 19 days
Fine To Pay: ₹10
Allowed days: 14 days

Fine per extra day: ₹2 per day*/
import java.util.*;
public class library {
	int id,idate,rdate,totalday,fine;
	String bname,aname,sname;
	void calculate() {
		totalday=rdate-idate;
		if(totalday > 14) 
			fine = (totalday - 14) * 2;
			else 
				fine = 0;
		
	}
	
	void display() {
		System.out.println("Book Taken For:" +totalday+ "days");
		System.out.println("Fine To Pay:₹" + fine);
	}
}

class main{
	public static void main(String[] args) {
		Scanner v=new Scanner(System.in);
		library l1=new library();
		System.out.println("---- Library Information ----");
		System.out.print("Enter Book ID:");
		l1.id = v.nextInt();
		 v.nextLine(); 
		System.out.print("Enter Book Name:");
		l1.bname = v.nextLine();
		System.out.print("Enter Author Name:");
		l1.aname = v.nextLine();
		System.out.println("Enter Student Name:");
		l1.sname = v.nextLine();
		System.out.println("Enter Issued Day Number:");
		l1.idate = v.nextInt();
		System.out.println("Enter Return Day Number:");
		l1.rdate = v.nextInt();
		l1.calculate();
		l1.display();
		v.close();
		
	}
}
