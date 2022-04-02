package example3;

import java.util.HashMap;
import java.util.Map.Entry;

public class Collections8 {

	public static void main(String[] args) {
        HashMap<Integer,String> K=new HashMap<Integer,String>();
        K.put(1,"mango");
        K.put(2,"banana");
        K.put(3,"apple");
        K.put(4,"guaua");
        System.out.println(K.keySet());
        System.out.println(K.values());
        for(Entry<Integer,String> p:K.entrySet()) 
        
        {
        
        	System.out.println(p.getKey()+":\t"+p.getValue());
      }
        
        
	}

}
