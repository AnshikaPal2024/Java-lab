package Collection;

import java.util.HashSet;
import java.util.Set;

public class HasSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Set<String> set1=new HashSet<String>();
       set1.add("apple");
       set1.add("orange");
       set1.add("mango");
       set1.add("grapes");
       set1.add("orange");
      System.out.print("size is"+set1);
      int size =set1.size();
      System.out.println("size is"+size);
      boolean b=set1.contains("apple");
      System.out.println("set contain apple "+b);
      boolean b1=set1.remove("orange");
      System.out.println(set1);
      System.out.println(set1.size());
    		  
	}

}
