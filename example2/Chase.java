package example2;

public class Chase implements Bank {

	public static void main(String[] args) {
		Chase c1= new Chase();
		c1.getDetails();
		c1.display();
		System.out.println("rate of interest is :"+ Bank.rateofinterest);

	}
	
	public void getDetails() {
		System.out.println("rate of interest is :" );
		
	}

	
	public void display() { 
		
		System.out.println("rate of interest is :");
	}

}
