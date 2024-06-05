package ExceptionHandling;

import java.util.Scanner;

public class SubStringCount {

	public static void main(String[] args) {
		System.out.println("Enter a big str-");
		Scanner sc=new Scanner (System.in);
		String st =sc.nextLine().toLowerCase();
		
		System.out.print("Enter a str to find-");
		String find=sc.next().toLowerCase();
		
		int Count=0;
		int fromEnd=0;
		for (int i=0;i<st.length();i++) {
			
			if((st.indexOf(find,fromEnd))>=0) {
				
				fromEnd=(st.indexOf(find,fromEnd))+find.length();
				Count++;
			}
			if(!(st.indexOf(find, fromEnd)>=0)) {
			break;
			
				
			}
		}
       System.out.println(find+"repeats-"+Count+"times");
	}

}
