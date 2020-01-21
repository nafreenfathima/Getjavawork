package encapsulation;
	public class Recurringacc extends Bankdemo //Inheritance
	{
		
		//abstraction
		private String RecurringAccNum;
		
		
		//Constructor
		public Recurringacc(String recurringAccNum) {
			super();
			RecurringAccNum = recurringAccNum;
		}

		public Recurringacc() {
			// TODO Auto-generated constructor stub
		}

		//encapsulation
		public String getRecurringAccNum() {
			return RecurringAccNum;
		}

		public void setRecurringAccNum(String recurringAccNum) {
			RecurringAccNum = recurringAccNum;
		}
		
		public void display()
		{
			System.out.println("this is a Recurring Account");
		
	}

	}


