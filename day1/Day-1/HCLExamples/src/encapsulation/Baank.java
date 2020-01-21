package encapsulation;
	public class Baank extends Bankdemo  //Inheritance
	{
		
		//abstraction
		private int Bankid;
		private String BankName;
		private String ifsc;
		
		
		//Constructor
		public Baank(int bankid, String bankName, String ifsc) {
			super();
			Bankid = bankid;
			BankName = bankName;
			this.ifsc = ifsc;
		}
		public Baank() {
			// TODO Auto-generated constructor stub
		}
		//encapsulation
		public int getBankid() {
			return Bankid;
		}
		public void setBankid(int bankid) {
			Bankid = bankid;
		}
		public String getBankName() {
			return BankName;
		}
		public void setBankName(String bankName) {
			BankName = bankName;
		}
		public String getIfsc() {
			return ifsc;
		}
		public void setIfsc(String ifsc) {
			this.ifsc = ifsc;
		}
		
		public void display()
		{
			System.out.println("this is a Bank Account");
		
	}

	}


