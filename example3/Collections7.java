package example3;

import java.util.ArrayList;

public class Collections7 {

	public static void main(String[] args) {
       ArrayList <String> a1=new ArrayList<String>();
       a1.add("apple");
       a1.add("banana");
       a1.add("cherries");
       a1.add("mango");
       System.out.println("fruits are:" + a1.get(1));
       //changing the element
       a1.set(3, "dates");
       //using for loop
       for(String fruit:a1) 
       {
    	   System.out.println(fruit);
       }
    	   
    		   
	}

}
