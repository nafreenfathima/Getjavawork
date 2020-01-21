class Address {
		 private String addressLine1;//Declaring variables
		 private String addressLine2;
		 private String city;
		 private String state;
		 private int pincode;
		 
		 public Address() {//Default constructor
		  super();
		 }
		 public Address(String addressLine1, String addressLine2, String city, String state, int pincode) {//Parameterized constructor
		  super();
		  this.addressLine1 = addressLine1;
		  this.addressLine2 = addressLine2;
		  this.city = city;
		  this.state = state;
		  this.pincode = pincode;
		 }
		 public String getAddressLine1() {//Getters and Setters for Variables
		  return addressLine1;
		 }
		 public void setAddressLine1(String addressLine1) {
		  this.addressLine1 = addressLine1;
		 }
		 public String getAddressLine2() {
		  return addressLine2;
		 }
		 public void setAddressLine2(String addressLine2) {
		  this.addressLine2 = addressLine2;
		 }
		 public String getCity() {
		  return city;
		 }
		 public void setCity(String city) {
		  this.city = city;
		 }
		 public String getState() {
		  return state;
		 }
		 public void setState(String state) {
		  this.state = state;
		 }
		 public int getPincode() {
		  return pincode;
		 }
		 public void setPincode(int pincode) {
		  this.pincode = pincode;
		 }
		@Override
		public String toString() {
		    System.out.printf("%-15s%-15s%-15s%-15s%-15s",addressLine1,addressLine2,city,state,pincode);
			/*return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city + ", state="
					+ state + ", pincode=" + pincode + "]";*/
			return "";
		} 
		}

