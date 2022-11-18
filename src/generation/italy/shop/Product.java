package generation.italy.shop;

public class Product {
	
	private int code;
	private String name;
	private String brand;
	private float price;
	private float tax=0.2f;
	
	public Product(int code, String name, String brand, float price) {
		this.code = code;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPricePlusTax() {
		return String.format("%.2f", price+price*tax);
	}
	
}
