package example3;

import java.util.PriorityQueue;

public class Collections5 {

	public static void main(String[] args) {
		PriorityQueue<String> P = new PriorityQueue<String>();
		P.add("revathi");
		P.add("manasa");
		P.add("jahnvai");
		System.out.println(P.element());
		System.out.println(P.peek());
		System.out.println(P.toString());
	}

}
