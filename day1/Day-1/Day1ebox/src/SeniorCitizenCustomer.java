class SeniorCitizenCustomer extends Customer4
	{

	    public  double amount;	
		public SeniorCitizenCustomer(String name, String address, int age, String mobileNumber, double amount) {
			super(name, address, age, mobileNumber);
			this.amount = amount;
		}

		public double getAmount() {
			return this.amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}
		public double generateBillAmount(double amount)
		{
			double z= amount-(0.12*amount);
			return z;
		}
	}

