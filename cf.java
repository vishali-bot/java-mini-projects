import java.util.*;
public class cf {
	
	public static void main(String[] args) {
		double a,b;
		char operator;
		Scanner v=new Scanner(System.in);
		System.out.print("enter the 1st number:");
		a = v.nextDouble();
		System.out.print("enter an operator (+,-,*,/,^):");
		operator=v.next().charAt(0);
		
		
		System.out.print("enter the 2st number:");
		b = v.nextDouble();
		switch(operator) {
		case '+' -> System.out.println(a+b);
		case '-' -> System.out.println(a-b);
		case '*' -> System.out.println(a*b);
		case '/' -> System.out.println(a/b);
		case '^' -> System.out.println(Math.pow(a, b));
		
		}
		v.close();
	}
	
}
