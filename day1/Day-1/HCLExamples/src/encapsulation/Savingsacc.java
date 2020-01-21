package encapsulation;


	
	public class Savingsacc extends Bankdemo //Inheritance
	{
		//abstraction
		private int Accountnum;
		
		
		//Constructor
		public Savingsacc(int accountnum) {
			super();
			Accountnum = accountnum;
		}

		public Savingsacc() {
			// TODO Auto-generated constructor stub
		}

		//encapsulation
		public int getAccountnum() {
			return Accountnum;
		}

		public void setAccountnum(int accountnum) {
			Accountnum = accountnum;
		}
		public void display()
		{
			System.out.println("this is a SavingsAccount");
		
	}
		
	}


