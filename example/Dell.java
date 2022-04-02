package example;

public class Dell extends Computer {
          String HDD;
	public String getHDD() {
			return HDD;
		}
		public void setHDD(String hDD) {
			HDD = hDD;
		}
	public static void main(String[] args) {
		Dell obj=new Dell();
		obj.setRam(8);
		obj.setProcessor("intel core i3");
		obj.setOS("windows");
		obj.setHDD("2 tb");
		System.out.println("dell configuration: " + obj.getRam() + "\n" + obj.getProcessor() + "\n" + obj.getOS() + "\n" + obj.getHDD());
		
		
		

	}

}
