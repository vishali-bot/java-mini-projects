import java.util.*;

public class Clinic {
    int id, fee, rent,total;
    String name, disease;

    Clinic(int i, String n) {
        id = i;
        name = n;
    }

    Clinic(int i, String n, String d, int f) {
        id = i;
        name = n;
        disease = d;
        fee = f;
    }

    Clinic(int i, String n, String d, int f, int r) {
        id = i;
        name = n;
        disease = d;
        fee = f;
        rent = r;
    }
    
    void display() {
    	System.out.println("id:" + id);
    	System.out.println("Name:" + name);
    	System.out.println("disease:" + disease);
    	if(fee >= 1000) {
    		total = fee+rent;
    		System.out.println("fee:" + fee);
    		System.out.println("rent:" + rent);
    		System.out.println("total:" + total);
    	}
    	
    	
    	
    }

    public static void main(String[] args) {
    	
    	Scanner v =new Scanner(System.in);
    	System.out.print("Enter your ID:");
    	id = v.nextInt();
    	v.nextLine();
    	System.out.print("Enter your name:");
    	name =v.nextLine();
    	System.out.print("Enter your disease:");
    	disease =v.nextLine();
    	System.out.print("Enter your fee:");
    	fee = v.nextInt();
    	System.out.print("Enter your rent (if no enter 0):");
    	rent = v.nextInt();
    	
    	
    	Clinic c1 = new Clinic(id,name,disease,fee,rent);
    			c1.display();
    	
    	
    	 v.close();
       
    }
}
