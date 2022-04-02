package example2;

public class Abstraction2 extends Abstraction {
   @Override
   public void abstractmethod() {
 	  System.out.println("this is abstraction class from child class");
 	  
   }
	public static void main(String[] args) {
		Abstraction2 obj=new Abstraction2 ();
		obj.dispaly();
		obj.abstractmethod();
      
	}

}
