package example2;

public class Mathsteacher extends Teacher {
	String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public static void main(String[] args) {
		Mathsteacher m1 = new Mathsteacher();
		m1.setSubject("maths");
		m1.setDesignation("HOD");
		m1.setCollegename("BBCIT");
		System.out
				.println("Information: \n" + m1.getSubject() + "\n" + m1.getDesignation() + "\n" + m1.getCollegename());

	}

}
