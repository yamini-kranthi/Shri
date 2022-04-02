package example3;

import java.util.ArrayDeque;
import java.util.Deque;

public class Collections6 {

	public static void main(String[] args) {
		Deque<String> D = new ArrayDeque<String>();
		D.add("aaa");
		D.addFirst("BBb");
		D.addLast("CCC");
		System.out.println(D.toString());
		System.out.println(D.element());
		System.out.println(D.getLast());
		
	
		
	}

}
