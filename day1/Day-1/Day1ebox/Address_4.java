public class Address_4 implements Comparable<Address_4> {
		  private String addressLine1;
		  private String addressLine2;
		  private String username;
		  private Integer pinCode;

				 public Address_4() {
				 }
				 public Address_4(String addressLine1, String addressLine2, String username, Integer pinCode) {
				  super();
				  this.addressLine1 = addressLine1;
				  this.addressLine2 = addressLine2;
				  this.username = username;
				  this.pinCode = pinCode;
				 }
				 public String getAddressLine1() {
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
				 public String getUsername() {
				  return username;
				 }
				 public void setUsername(String username) {
				  this.username = username;
				 }
				 public Integer getPinCode() {
				  return pinCode;
				 }
				 public void setPinCode(Integer pinCode) {
				  this.pinCode = pinCode;
				 }

				 @Override
				 public int compareTo(Address_4 st){   
				   int pinCode=this.pinCode.compareTo(st.pinCode);  
				     return pinCode==0?this.addressLine1.compareTo(st.addressLine1):pinCode;
				   }   
				 }

