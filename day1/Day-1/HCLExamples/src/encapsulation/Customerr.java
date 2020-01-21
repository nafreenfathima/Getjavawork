package encapsulation;


	
	public class Customerr extends Bankdemo //Inheritance
	{
		
		//abstraction
		private String CustomerName;
		private int Age;
		private String Address;
		private int DOB;
		private int MobileNumber;
		private String DestinationName;
		private int PhoneNum;
		private String Reason;
		private String Status;
		private int DepartureDate;
		
		
		//Constructor
		public Customerr(String customerName, int age, String address, int dOB, int mobileNumber, String destinationName,
				int phoneNum, String reason, String status, int departureDate) {
			super();
			CustomerName = customerName;
			Age = age;
			Address = address;
			DOB = dOB;
			MobileNumber = mobileNumber;
			DestinationName = destinationName;
			PhoneNum = phoneNum;
			Reason = reason;
			Status = status;
			DepartureDate = departureDate;
		}
		public Customerr() {
			// TODO Auto-generated constructor stub
		}
		//encapsulation
		public String getCustomerName() {
			return CustomerName;
		}
		public void setCustomerName(String customerName) {
			CustomerName = customerName;
		}
		public int getAge() {
			return Age;
		}
		public void setAge(int age) {
			Age = age;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public int getDOB() {
			return DOB;
		}
		public void setDOB(int dOB) {
			DOB = dOB;
		}
		public int getMobileNumber() {
			return MobileNumber;
		}
		public void setMobileNumber(int mobileNumber) {
			MobileNumber = mobileNumber;
		}
		public String getDestinationName() {
			return DestinationName;
		}
		public void setDestinationName(String destinationName) {
			DestinationName = destinationName;
		}
		public int getPhoneNum() {
			return PhoneNum;
		}
		public void setPhoneNum(int phoneNum) {
			PhoneNum = phoneNum;
		}
		public String getReason() {
			return Reason;
		}
		public void setReason(String reason) {
			Reason = reason;
		}
		public String getStatus() {
			return Status;
		}
		public void setStatus(String status) {
			Status = status;
		}
		public int getDepartureDate() {
			return DepartureDate;
		}
		public void setDepartureDate(int departureDate) {
			DepartureDate = departureDate;
		}
		public void display()
		{
			System.out.println("this is a Customer Account");
		
	}
		
		
	}


