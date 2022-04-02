package example2;

public class Mteacher extends Teacher2 {
      String collegename;
     
      public void getDetails(String collegename,String name,int age,String subject)
      {
    	  
          super.getDetails( name, age, subject);
    	  this.collegename=collegename;
      }
      @Override
      public void displaydetails() {
    	  super.displaydetails();
    	  System.out.println("college name is:" + this.collegename);
      }
	public static void main(String[] args) {
          Mteacher m1= new   Mteacher();
          m1.getDetails("BBCIT", "jyothi", 32,"maths");
          m1.displaydetails();
	}

}
