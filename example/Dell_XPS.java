package example;

public class Dell_XPS extends Dell {
        String Cost;
        
	public String getCost() {
			return Cost;
		}

		public void setCost(String cost) {
			this.Cost = cost;
		}

	public static void main(String[] args) {
          Dell_XPS d1=new Dell_XPS();
          d1.setCost("950$");
          d1.setHDD("2tb");
          d1.setRam(8);
          d1.setOS("linux");
          d1.setProcessor("intel");
          System.out.println("dell configuration:\n" + d1.getCost() +"\n" + d1.getHDD() + "\n" + d1.getRam() + "\n" + d1.getProcessor() +"\n" + d1.getOS());
	}

		
	}


