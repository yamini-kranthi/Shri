package example2;

public class Teacher2 {
	String name;
	int age;
	String subject;
	public void getDetails(String name,int age,String subject) {
		this.name=name;
		this.age=age;
		this.subject=subject;
	}
	public void displaydetails() {
		System.out.println("teacher name:"+name);
		System.out.println("age is:"+ age);
		System.out.println("subject name is:" +subject);
	}

}
