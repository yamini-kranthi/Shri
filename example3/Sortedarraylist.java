package example3;

import java.util.ArrayList;
import java.util.List;

public class Sortedarraylist {

	public static void main(String[] args) {
       List<String> L1=new ArrayList<String>();
       L1.add("mango");
       L1.add("kiwi");
       L1.add("watermelon");
       L1.add("papaya");
       for(String fruit:L1) {
    	   System.out.println(fruit);
       }
       
	}

}
