public class Product1 {
	private long id;
	private String productName;
	private String supplierName;
	private int price;

	public Product1(long id, String productName, String supplierName, int price) {
	this.id = id;
	this.productName = productName;
	this.supplierName = supplierName;
	this.price = price;
	}
	public long getId() {
	return this.id;
	}
	public void setId(long id) {
	this.id = id;
	}
	public String getProductName() {
	return this.productName;
	}
	public void setProductName(String productName) {
	this.productName = productName;
	}
	public String getSupplierName() {
	return this.supplierName;
	}
	public void setSupplierName(String supplierName) {
	this.supplierName = supplierName;
	}
	public int getPrice() {
	return this.price;
	}
	public void setPrice(int price) {
	this.price = price;
	}



	}

