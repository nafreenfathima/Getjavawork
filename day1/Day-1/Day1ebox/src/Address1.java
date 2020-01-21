
public class Address1 {
private static String street;
		private static String city;
		private static int pincode;
		private static String country;
		public Address1(String street, String city, int pincode, String country) {
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		this.country = country;
		}
		public String getStreet() {
		return this.street;
		}
		public void setStreet(String street) {
		this.street = street;
		}
		public String getCity() {
		return this.city;
		}
		public void setCity(String city) {
		this.city = city;
		}
		public int getPincode() {
		return this.pincode;
		}
		public void setPincode(int pincode) {
		this.pincode = pincode;
		}
		public String getCountry() {
		return this.country;
		}
		public void setCountry(String country) {
		this.country = country;
		}

		static void displayAddress()
		{
		System.out.println("Street: "+street);
		System.out.println("City: "+city);
		System.out.println("Pincode: "+pincode);
		System.out.println("Country: "+country);
		}

		}


