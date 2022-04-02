package example;

public class Mac extends Computer {
      int SSD;
	public int getSSD() {
		return SSD;
	}
	public void setSSD(int sSD) {
		SSD = sSD;
	}
	public static void main(String[] args) {
         Mac obj=new Mac();
         obj.setRam(8);
         obj.setProcessor("intel");
         obj.setOS("unix");
         obj.setSSD(2);
         System.out.println("Mac configuration: \n" + obj.getRam() + "\n" +obj.getProcessor() + "\n" + obj.getOS() + "\n"+ obj.getSSD());
         
	}
}
