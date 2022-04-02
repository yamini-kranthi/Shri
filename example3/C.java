package example3;

public class C implements Interface1, Interface2 {

	public static void main(String[] args) {
		C obj = new C();
		obj.display();
	}

	@Override
	public void display() {
		Interface1.super.display();
		Interface2.super.display();

	}

}
