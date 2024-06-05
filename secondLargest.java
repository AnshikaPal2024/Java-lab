package Demojavabean;

import java.util.Scanner;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in); 
      
      System.out.print("Enter first num:");
      double num1 = sc.nextDouble();
      
      System.out.print("Enter Second num:");
      double num2 = sc.nextDouble();
      
      System .out.print("Enter third num:");
      double num3 = sc.nextDouble();
      
      double secondLargest = findSecondLargest(num1,num2,num3);
       
      if (Double.isFinite(secondLargest)) {
    	  System.out.println("there is no second largest number.");
      }
      else
      {
    	  System.out.println("the second largest number is: "+secondLargest);
    	  
      }
	}
	 public static double findSecondLargest(double num1,double num2, double num3) {
		 double largest = Math.max(num1, Math.max(num2, num3));
		 double smallest = Math.min(num1, Math.min(num2, num3));
		 double secondLargest =Double.POSITIVE_INFINITY;
		 
		 if (num1 != largest && num1 !=smallest) {
			 secondLargest = num1;
		 }
		 else if (num2 != largest && num2 != smallest) {
			 secondLargest = num2;
		 }
		 else if (num3 != largest && num3 != smallest) {
			 secondLargest=num3;
		 }
		 return secondLargest;
	 }
}
	 


