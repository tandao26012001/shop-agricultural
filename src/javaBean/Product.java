package javaBean;

public class Product {

	private int productid;
	private int catalogid;
	private String productname;
	private String price;
	private int status;
	private String description;
	private String content;
	private int discount;
	private String image;
	private String created;
	
	public Product() {
		super();
	}
	
	public Product(int productid, int catalogid, String productname, String price, int status, String description,
			String content, int discount, String image, String created) {
		super();
		this.productid = productid;
		this.catalogid = catalogid;
		this.productname = productname;
		this.price = price;
		this.status = status;
		this.description = description;
		this.content = content;
		this.discount = discount;
		this.image = image;
		this.created = created;
	}

	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getCatalogid() {
		return catalogid;
	}
	public void setCatalogid(int catalogid) {
		this.catalogid = catalogid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	
}
