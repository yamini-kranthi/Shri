package example3;

import java.util.Stack;

public class Collections4 {

	public static void main(String[] args) {
   Stack<String> X=new Stack<String>();
        X.push("aaa");
        X.push("bbb");
        X.push("ccc");
        X.peek();
        System.out.println(X.toString());
        System.out.println(X.get(1));
	
	}
}
