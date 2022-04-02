package example3;

import java.util.Vector;

public class Collections3 {
    public static void main(String[] args) {
    	Vector<String> V=new Vector<String>();
    	V.add("raju");
    	V.add("mala");
    	V.add("kala");
    	System.out.println("names are:"+V.firstElement());
    	System.out.println(V.lastIndexOf(V));
    	System.out.println(V.clone());
    	System.out.println(V.remove(1));
    	System.out.println(V.toString());
    	
    }
}
