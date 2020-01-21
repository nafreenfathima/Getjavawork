public class Address {
	    
		private String line1;
		private String line2;
		private String line3;
		private String city;
		private String state;
		private String country;
		private String otherDetails;
		private int zipCode;
		
		public Address(String line1, String line2, String line3, String city, String state, String country,
				String otherDetails, int zipCode) {
			super();
			this.line1 = line1;
			this.line2 = line2;
			this.line3 = line3;
			this.city = city;
			this.state = state;
			this.country = country;
			this.otherDetails = otherDetails;
			this.zipCode = zipCode;
		}

		public String getLine1() {
			return this.line1;
		}

		public void setLine1(String line1) {
			this.line1 = line1;
		}

		public String getLine2() {
			return this.line2;
		}

		public void setLine2(String line2) {
			this.line2 = line2;
		}

		public String getLine3() {
			return this.line3;
		}

		public void setLine3(String line3) {
			this.line3 = line3;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCountry() {
			return this.country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getOtherDetails() {
			return this.otherDetails;
		}

		public void setOtherDetails(String otherDetails) {
			this.otherDetails = otherDetails;
		}

		public int getZipCode() {
			return this.zipCode;
		}

		public void setZipCode(int zipCode) {
			this.zipCode = zipCode;
		}

		@Override
		public String toString() {
			return line1+",\n"+line2+",\n"+otherDetails+",\n"+line3+",\n"+city+" - "+zipCode+",\n"+state+",\n"+country;
		}
		
		

}


