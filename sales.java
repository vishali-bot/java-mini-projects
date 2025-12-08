/* if shopping > 2000rs 10%
 * if shopping > 2500rs 15%
 * if shopping > 5000rs 20%
 * if shopping > 500rs free gift
*/
import java.util.*;
public class sales {
	String name;
	int total;
	double discount,tam;
	
	
	void discount() {
		if(total >= 5000) {
			System.out.println("You got 20% discount");
			discount=0.20 * total;
			tam = total-discount;
			System.out.println("Your final amount:" +tam);
		}
		else if(total >= 2500) {
			System.out.println("You got 15% discount");
			discount=0.15 * total;
			tam = total-discount;
			System.out.println("Your final amount:" +tam );
			
		}
		else if(total >= 2000) {
			System.out.println("You got 10% discount");
			discount=0.10 * total;
			tam = total-discount;
			System.out.println("Your final amount:" +tam);
			
		}
		else{
			System.out.println("You got a free gift");
		}
		
		
	}
}


class main{
	public static void main(String[] args) {
		Scanner v=new Scanner(System.in);
		sales s1=new sales();
		System.out.print("Enter your name:");
		s1.name=v.nextLine();
		System.out.print("Enter your total amount:");
		s1.total=v.nextInt();
		
		s1.discount();
		System.out.println("Thankyou for shopping");
		v.close();
	}
}
