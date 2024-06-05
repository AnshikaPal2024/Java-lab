package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class SumIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=  new Scanner(System.in);
      ArrayList<Integer> numbers =new ArrayList<Integer>();
      
      for (int i=0; i<10; i++) {
    	  System.out.print("Enter number"+(i+1)+":");
    	  
    	  
    		System.out.print("Enter number"+(i+1)+":");
    		int number=sc.nextInt();
    		numbers.add(number);
    		int sum=0;
    		for(int num : numbers)
    		{
    			sum+=num;
    		}
    		System.out.println("the sum of the numbers is:"+sum);
    		
    	  
      }
	}
	


