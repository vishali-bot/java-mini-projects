import java.util.*;
public class emp {
	String name,id;
	double hra,da,cca,pf,gp,net;
	int bp;
	
	void calculate() {
		hra = 0.20 *bp;
		da= 0.50*bp;
		cca = 0.10*bp;
		gp =bp+hra+da+cca;
		 pf  = 0.12 * bp;   
	     net = gp - pf; 	
	}
	void display() {
		System.out.print("HRA:"+hra+"\nDA:"+da+"\nCCA:"+cca+"\nGROSS PROFIT:"+gp+"\nPF:"+pf+"\nNET PROFIT:"+net);
		
	}

}

class Main{
	public static void main(String[] args) {
		Scanner v=new Scanner(System.in);
		String choice;
		do {
		emp e1=new emp();
		System.out.print("Enter your name:");
		e1.name=v.nextLine();
		System.out.print("Enter your id:");
		e1.id=v.nextLine();
		System.out.print("Basic salary:");
		e1.bp=v.nextInt();
		
		v.nextLine();
		
		e1.calculate();
		e1.display();
		
		System.out.print("Do you want to continue?(yes/no):");
		choice=v.nextLine();
		}while(choice.equalsIgnoreCase("yes"));
		v.close();
		System.out.print("Program ended");
	}
}
