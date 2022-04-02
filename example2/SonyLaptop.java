package example2;

public class SonyLaptop implements LaptopInterfaces {

	public static void main(String[] args)
	{
		SonyLaptop s1=new SonyLaptop();
		s1.getConfiguration();
		s1.display();
		System.out.println("price is :"+LaptopInterfaces.price  );
		
          
	}


	public void getConfiguration()
	{
		System.out.println("this is get configuration method");
		
	}
	public void display()
	{
		System.out.println("this is display method");		
	}

}
