
public class Customer {
	    private String customerName;
		private String customerEmail;
		
		public Customer(String customerName, String customerEmail) {
			this.customerName = customerName;
			this.customerEmail = customerEmail;
		}

		public String getCustomerName() {
			return this.customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getCustomerEmail() {
			return this.customerEmail;
		}

		public void setCustomerEmail(String customerEmail) {
			this.customerEmail = customerEmail;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((customerEmail == null) ? 0 : customerEmail.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Customer other = (Customer) obj;
			if (customerEmail == null) {
				if (other.customerEmail != null)
					return false;
			} else if (!customerEmail.equals(other.customerEmail))
				return false;
			return true;
		}
		public boolean equalsIgnoreCase(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Customer other = (Customer) obj;
			if (customerEmail == null) {
				if (other.customerEmail != null)
					return false;
			} else if (!customerEmail.equalsIgnoreCase(other.customerEmail))
				return false;
			return true;
		}
		

	}




