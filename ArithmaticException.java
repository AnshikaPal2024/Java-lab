package ExceptionHandling;

import java.util.Scanner;

public class ArithmaticException {

	public static void main(String[] args) {
		int quotient=0;
		System.out.print("Enter a dividend-");
		Scanner sc =new Scanner(System.in);
		 int dividend=sc.nextInt();
          
		 System.out.print("Enter a divisor-");
		 int divisor=sc.nextInt();
		 
		 try
		 {
			 quotient=dividend/divisor;
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("divided by zero");
		 }
		 System.out.println("Quotient-"+quotient);
	}

}
