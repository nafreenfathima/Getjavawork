package encapsulation;


	

	public class Servicenum extends Bankdemo  //Inheritance
	{
		
		//abstraction
		private int ServiceNumber;
		
		
		//Constructor
		public Servicenum(int serviceNumber) {
			super();
			ServiceNumber = serviceNumber;
		}
		
		public Servicenum() {
			// TODO Auto-generated constructor stub
		}

		//encapsulation
		public int getServiceNumber() {
			return ServiceNumber;
		}

		public void setServiceNumber(int serviceNumber) {
			ServiceNumber = serviceNumber;
		}

		public void display()
		{
			System.out.println("this is a Service Account");
		
	}
		
	}


