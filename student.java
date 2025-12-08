import java.util.*;
public class student{
	String name,rollno;
	int total,m1,m2,m3;
	double avg;
	
	void calculate() {
		total = m1+m2+m3;
		avg = total/3.0;
	}
	void displayInfo(){
		System.out.print("Total:" + total);
		System.out.print("\nAverage:" + avg);
		if(total >= 250) {
			System.out.print("\nGrade:A");
		}
		else if(total >= 200) {
			System.out.print("\nGrade:B");
		}
		else if(total >= 150) {
			System.out.print("\nGrade:c");
		}
		else {
			System.out.print("\nFail");
		}
		
		
	}
}
	class Main{
		public static void main(String[] args) {
		Scanner v =new Scanner(System.in);
		String choice;
		do {
		student s1 = new student();
		System.out.print("Enter your name:");
		s1.name=v.nextLine();
		System.out.print("Enter you rollno:");
		s1.rollno=v.nextLine();
		System.out.print("mark1:");
		s1.m1=v.nextInt();
		System.out.print("mark2:");
		s1.m2=v.nextInt();
		System.out.print("mark3:");
		s1.m3=v.nextInt();
		
		v.nextLine(); 
		
		s1.calculate();
		s1.displayInfo();
		
		System.out.print("\n Do you want to continue? (yes/no):");
		choice=v.nextLine();
		}while(choice.equalsIgnoreCase("yes"));
		v.close();
		System.out.println("program ended");
	}
	}
	
