package example3;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
        HashMap<String,String> h1=new HashMap<String,String>();
        h1.put("Name", "ruby");
        h1.put("city", "hyderabad");
        h1.put("country", "india");
        for(Entry<String, String> e1:h1.entrySet()) 
        {
        	System.out.println(e1.getKey()+":\t" +e1.getValue());
        }
        HashMap<Integer,String> h2=new HashMap<Integer,String>();
        h2.put(1, "kavita");
        h2.put(2, "bhavana");
        h2.put(3,"hasini");
        h2.put(4, "jalaja");
        for(Entry<Integer,String> e2:h2.entrySet()) {
        	System.out.println(e2.getKey()+":\t"+e2.getValue());
        }
	}

}
