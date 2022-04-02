package example3;

import java.util.LinkedList;

public class Collections2 {

	public static void main(String[] args) {
		LinkedList<String> C = new LinkedList<String>();
		C.add("suma");
		C.add("lalitha");
		C.add("kalavathi");
		System.out.println("names are:" + C.toString());
		LinkedList<Integer> B = new LinkedList<Integer>();
		B.add(10);
		B.add(20);
		B.add(30);
		B.add(40);
		B.add(50);
		System.out.println("numbers are:" + B.toString());

	}

}
