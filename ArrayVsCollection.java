package Collection;

import java.util.ArrayList;

public class ArrayVsCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] arr= {"w","e","l","c","o","m","e"};
        for(int i=0;i<arr.length;i++)
       
		System.out.print(arr[i]);
        System.out.println();
        ArrayList<String> al=new ArrayList<String>();
        
      al.add("w");
      al.add("e");
      al.add("l");
      al.add("c");
      al.add("o");
      al.add("m");
      al.add("e");
      System.out.println(al);
	}
	

}
