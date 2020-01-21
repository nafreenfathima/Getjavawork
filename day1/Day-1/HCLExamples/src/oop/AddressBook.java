package oop;

public class AddressBook {
	

	
		private String name;
		private Address temptAdd;
		private Address permAdd;
		private long phoneNumber;
		private String email;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Address getTemptAdd() {
			return temptAdd;
		}
		public void setTemptAdd(Address temptAdd) {
			this.temptAdd = temptAdd;
		}
		public Address getPermAdd() {
			return permAdd;
		}
		public void setPermAdd(Address permAdd) {
			this.permAdd = permAdd;
		}
		public long getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		


	//nested class
	class Address
	{
		private String name;
		private String street;
		private String address;
		private String city;
		private String state;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
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
		@Override
		public String toString() {
			return "Address [name=" + name + ", street=" + street + ", address=" + address + ", city=" + city + ", state="
					+ state + "]";
		}
		
	}
	}


