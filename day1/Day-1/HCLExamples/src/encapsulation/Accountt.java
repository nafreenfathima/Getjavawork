package encapsulation;
public class Accountt extends Bankdemo //Inheritance
	{
		
		
		//abstraction
		private int accountNum;
		private String accountType;
		private float balance;
		private String userName;
		private int ifsc;
		
		
		//Constructor
		public Accountt(int accountNum, String accountType, float balance, String userName, int ifsc) {
			super();
			this.accountNum = accountNum;
			this.accountType = accountType;
			this.balance = balance;
			this.userName = userName;
			this.ifsc = ifsc;
		}
		public Accountt() {
			// TODO Auto-generated constructor stub
		}
		//encapsulation
		public int getAccountNum() {
			return accountNum;
		}
		public void setAccountNum(int accountNum) {
			this.accountNum = accountNum;
		}
		public String getAccountType() {
			return accountType;
		}
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		public float getBalance() {
			return balance;
		}
		public void setBalance(float balance) {
			this.balance = balance;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public int getIfsc() {
			return ifsc;
		}
		public void setIfsc(int ifsc) {
			this.ifsc = ifsc;
		}
		public void display()
		{
			System.out.println("this is a Account");
		
	}
	}



