
public class Customeroop1 {
    public String customerName;
	public String customerEmail;
	public String customerType;
	public Address1 address;

	public Customeroop1(String customerName, String customerEmail, String customerType, Address1 address) {
	this.customerName = customerName;
	this.customerEmail = customerEmail;
	this.customerType = customerType;
	this.address = address;
	}

	public String getCustomerName() {
	return customerName;
	}

	public void setCustomerName(String customerName) {
	this.customerName = customerName;
	}

	public String getCustomerEmail() {
	return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
	}

	public String getCustomerType() {
	return customerType;
	}

	public void setCustomerType(String customerType) {
	this.customerType = customerType;
	}

	public Address1 getAddress() {
	return address;
	}

	public void setAddress(Address1 address) {
	this.address = address;
	}
	
void displayDetails()
{
System.out.println("Name: "+this.customerName);
System.out.println("E-mail: "+this.customerEmail);
System.out.println("Type: "+this.customerType);
Address1.displayAddress();
}
	}




